package com.elong.nb.dao.adapter.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import com.elong.nb.common.checklist.Constants;
import com.elong.nb.common.checklist.EnumNBLogType;
import com.elong.nb.common.checklist.NBActionLogHelper;
import com.elong.nb.common.gson.DateTypeAdapter;
import com.elong.nb.common.model.NbapiHttpRequest;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.common.util.HttpClientUtil;
import com.elong.nb.model.comment.Comment;
import com.elong.nb.model.comment.CommentInfo;
import com.elong.nb.model.comment.CommentResponse;
import com.elong.nb.model.comment.CommentResult;
import com.elong.nb.model.comment.CommentSumarryResponse;
import com.elong.nb.model.comment.CommentSummary;
import com.elong.nb.model.comment.CommentSummaryObj;
import com.elong.nb.model.comment.CommentSummaryResult;
import com.elong.nb.util.ThreadLocalUtil;
import com.google.gson.GsonBuilder;

@Repository
public class CommontRepository {
	private static final String COMMENT_DEFAULT_USER_KEY = "981754BD6AB391343BBEB9496D821E64";
	private static final String COMMENT_URL = CommonsUtil.CONFIG_PROVIDAR.getProperty("COMMENTURL");
	private static GsonBuilder gsonBuilder = new GsonBuilder();
	static {
		gsonBuilder.registerTypeAdapter(Date.class, new DateTypeAdapter());
	}

	/**
	 * 
	 * @param hotelIds
	 * @param userKey
	 * @return
	 */
	public CommentSummaryResult getSumarries(String hotelIds, String userKey) {
		Object userName = ThreadLocalUtil.get(Constants.ELONG_REQUEST_USERNAME);
		String userNameStr = userName == null ? null : (String) userName;

		CommentSummaryResult result = new CommentSummaryResult();
		if (StringUtils.isEmpty(userKey)) {
			userKey = COMMENT_DEFAULT_USER_KEY;
		}
		StringBuilder sb = new StringBuilder(COMMENT_URL + "/dianping/api/GetCommentSummarys?data={UserKey:\"");
		sb.append(userKey);
		sb.append("\",BusinessType:\"H\",ObjectIds:\"");
		sb.append(hotelIds);
		sb.append("\"}");
		try {
			long startTime = System.currentTimeMillis();
			NbapiHttpRequest nbapiHttpRequest = new NbapiHttpRequest();
			nbapiHttpRequest.setUrl(sb.toString());
			String responseStr = HttpClientUtil.httpGet(nbapiHttpRequest);
			long endTime = System.currentTimeMillis();
			CommentSumarryResponse response = gsonBuilder.create().fromJson(responseStr, CommentSumarryResponse.class);
			int businessCode = 0;
			if (response.getStatusCode() == 1 && response.getCommentSummarys() != null) {
				result.setCommentSummaries(new ArrayList<CommentSummary>());
				for (CommentSummaryObj c : response.getCommentSummarys()) {
					CommentSummary commentSummary = new CommentSummary();
					commentSummary.setHotelId(c.getObjectId());
					commentSummary.setBadCount(c.getBadCount());
					commentSummary.setTotal(c.getCommentCount());
					commentSummary.setGoodCount(c.getGoodCount());
					commentSummary.setGoodRatio(c.getGoodRate());
					result.getCommentSummaries().add(commentSummary);
				}
			} else {
				businessCode = 1;
			}
			NBActionLogHelper.businessLog(UUID.randomUUID().toString(), true, "GetCommentSummarys", COMMENT_URL, null,
					(endTime - startTime), businessCode, null, null, "", userNameStr, EnumNBLogType.DAO);
		} catch (Exception ex) {
			NBActionLogHelper.businessLog(UUID.randomUUID().toString(), false, "GetCommentSummarys", COMMENT_URL, null, 0, 0, null, null,
					"", userNameStr, EnumNBLogType.DAO);
		}
		return result;
	}

	/**
	 * 
	 * @param hotelId
	 * @param pageSize
	 * @param pageIndex
	 * @param userKey
	 * @return
	 */
	public CommentResult list(String hotelId, int pageSize, int pageIndex, String userKey) {
		Object userName = ThreadLocalUtil.get(Constants.ELONG_REQUEST_USERNAME);
		String userNameStr = userName == null ? null : (String) userName;

		CommentResult result = new CommentResult();
		if (StringUtils.isEmpty(userKey)) {
			userKey = COMMENT_DEFAULT_USER_KEY;
		}
		StringBuilder sb = new StringBuilder(COMMENT_URL + "/dianping/api/GetCommentsInfoByPage?data={UserKey:\"");
		sb.append(userKey);
		sb.append("\",BusinessType:\"H\",ObjectId:\"");
		sb.append(hotelId);
		sb.append("\",CommentType:0,PageSize:");
		sb.append(pageSize);
		sb.append(",PageNumber:");
		sb.append(pageIndex);
		sb.append(",NeedReply:false,NeedImage:true,NeedExt:true}");

		try {
			long startTime = System.currentTimeMillis();
			NbapiHttpRequest nbapiHttpRequest = new NbapiHttpRequest();
			nbapiHttpRequest.setUrl(sb.toString());
			String responseStr = HttpClientUtil.httpGet(nbapiHttpRequest);
			long endTime = System.currentTimeMillis();
			CommentResponse response = gsonBuilder.create().fromJson(responseStr, CommentResponse.class);
			int businessCode = 0;
			if (response.getStatusCode() == 1) {
				result.setComments(new LinkedList<CommentInfo>());
				result.setCount(response.getTotalNumber());
				for (Comment c : response.getComments()) {
					if (c.getSource() == 6)
						continue;
					CommentInfo commentInfo = new CommentInfo();
					commentInfo.setCommentId(c.getCommentId());
					commentInfo.setCheckInTime(c.getCommentExt().getOrder().getCheckInTime());
					commentInfo.setCommentType(c.getRecommend());
					commentInfo.setContent(c.getContent());
					commentInfo.setCreated(c.getCreateTime());
					commentInfo.setNickName(c.getCommentUser().getNickName());
					commentInfo.setRoomTypeId(c.getCommentExt().getOrder().getRoomTypeId());
					commentInfo.setRoomName(c.getCommentExt().getOrder().getRoomTypeName());
					commentInfo.setUsefulCount(c.getUsefulCount());
					commentInfo.setUserId(c.getCommentUser().getUserId());
					commentInfo.setCommentScore(c.getCommentScore());
					commentInfo.setImages(c.getImages());
					result.getComments().add(commentInfo);
				}
			} else {
				businessCode = -1;
			}
			NBActionLogHelper.businessLog(UUID.randomUUID().toString(), true, "GetCommentsByPage", COMMENT_URL, null,
					(endTime - startTime), businessCode, null, null, "", userNameStr, EnumNBLogType.DAO);
		} catch (Exception ex) {
			NBActionLogHelper.businessLog(UUID.randomUUID().toString(), false, "GetCommentsByPage", COMMENT_URL, null, 0, 0, null, null,
					"", userNameStr, EnumNBLogType.DAO);
		}
		return result;
	}
}
