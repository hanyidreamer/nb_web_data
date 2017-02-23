package com.elong.nb.dao.adapter.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import com.elong.nb.common.gson.DateTypeAdapter;
import com.elong.nb.common.util.CommonsUtil;
import com.elong.nb.model.comment.Comment;
import com.elong.nb.model.comment.CommentInfo;
import com.elong.nb.model.comment.CommentResponse;
import com.elong.nb.model.comment.CommentResult;
import com.elong.nb.model.comment.CommentSumarryResponse;
import com.elong.nb.model.comment.CommentSummary;
import com.elong.nb.model.comment.CommentSummaryObj;
import com.elong.nb.model.comment.CommentSummaryResult;
import com.elong.nb.util.HttpUtil;
import com.elong.springmvc_enhance.utilities.ActionLogHelper;
import com.google.gson.GsonBuilder;

@Repository
public class CommontRepository {
	private static final String COMMENT_DEFAULT_USER_KEY = "981754BD6AB391343BBEB9496D821E64";
	private static final String COMMENT_URL=CommonsUtil.CONFIG_PROVIDAR.getProperty("COMMENTURL");
	private static GsonBuilder gsonBuilder = new GsonBuilder();
	static{
		gsonBuilder.registerTypeAdapter(Date.class, new DateTypeAdapter());
	}
	/**
	 * 
	 * @param hotelIds
	 * @param message
	 * @param userKey
	 * @return
	 */
	public CommentSummaryResult getSumarries(String hotelIds, StringBuilder message,
			String userKey) {
		CommentSummaryResult result = new CommentSummaryResult();
		if (StringUtils.isEmpty(userKey)) {
			userKey = COMMENT_DEFAULT_USER_KEY;
		}
		StringBuilder sb = new StringBuilder(COMMENT_URL+"/dianping/api/GetCommentSummarys?data={UserKey:%22");
		sb.append(userKey);
		sb.append("%22,BusinessType:%22H%22,ObjectIds:%22");
		sb.append(hotelIds);
		sb.append("%22}");
		try {
			String responseStr = HttpUtil.httpGetData(sb.toString());
			CommentSumarryResponse response = gsonBuilder.create().fromJson(responseStr,
					CommentSumarryResponse.class);
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
				message =new StringBuilder(response.getMessage());
			}
		} catch (Exception ex) {
			message =new StringBuilder(ex.getMessage());
		}
		return result;
	}
	/**
	 * 
	 * @param hotelId
	 * @param pageSize
	 * @param pageIndex
	 * @param message
	 * @param userKey
	 * @return
	 */
	public CommentResult list(String hotelId, int pageSize, int pageIndex,
			StringBuilder message, String userKey) {
		CommentResult result = new CommentResult();
		if (StringUtils.isEmpty(userKey)) {
			userKey = COMMENT_DEFAULT_USER_KEY;
		}
		StringBuilder sb = new StringBuilder(COMMENT_URL+"/dianping/api/GetCommentsByPage?data={UserKey:%22");
		sb.append(userKey);
		sb.append("%22,BusinessType:%22H%22,ObjectId:%22");
		sb.append(hotelId);
		sb.append("%22,CommentType:0,PageSize:");
		sb.append(pageSize);
		sb.append(",PageNumber:");
		sb.append(pageIndex);
		sb.append(",NeedReply:false,NeedImage:false,NeedExt:true}");

		try {
			long startTime=System.currentTimeMillis();
			String responseStr = HttpUtil.httpGetData(sb.toString());
			long endTime=System.currentTimeMillis();
			CommentResponse response = gsonBuilder.create().fromJson(responseStr, CommentResponse.class);
			int businessCode=0;
			if (response.getStatusCode() == 1) {
				result.setComments(new LinkedList<CommentInfo>());
				result.setCount(response.getTotalNumber());
				for(Comment c:response.getComments()){
					CommentInfo commentInfo=new CommentInfo();
					commentInfo.setCommentId(c.getCommentId());
					commentInfo.setCheckInTime(c.getCommentExt().getOrder().getCheckInTime());
					commentInfo.setCommentType(c.getRecommend());
					commentInfo.setContent(c.getContent());
					commentInfo.setCreated(c.getCreateTime());
					commentInfo.setNickName(c.getCommentUser().getNickName());
					commentInfo.setRoomName(c.getCommentExt().getOrder().getRoomTypeName());
					commentInfo.setUsefulCount(c.getUsefulCount());
					commentInfo.setUserId(c.getCommentUser().getUserId());
					result.getComments().add(commentInfo);
				}	
			}else{
				message =new StringBuilder(response.getMessage());
				businessCode=-1;
			}
			ActionLogHelper.businessLog(UUID.randomUUID().toString(), true, "GetCommentsByPage", COMMENT_URL, null, (endTime - startTime), businessCode, null,null, "");
		} catch (Exception ex) {
			message =new StringBuilder(ex.getMessage());
			ActionLogHelper.businessLog(UUID.randomUUID().toString(), false, "GetCommentsByPage", COMMENT_URL, null, 0, 0, null,null, "");
		}
		return result;
	}
}
