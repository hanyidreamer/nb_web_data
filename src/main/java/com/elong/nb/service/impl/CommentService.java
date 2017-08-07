package com.elong.nb.service.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.elong.nb.common.model.ErrorCode;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.dao.adapter.repository.CommontRepository;
import com.elong.nb.model.comment.CommentCondition;
import com.elong.nb.model.comment.CommentResult;
import com.elong.nb.model.comment.CommentSummaryCondition;
import com.elong.nb.model.comment.CommentSummaryResult;
import com.elong.nb.service.ICommentService;

@Service
public class CommentService implements ICommentService {

	@Resource
	private CommontRepository commontRepository;

	@Override
	public RestResponse<CommentResult> ListComments(RestRequest<CommentCondition> request, ProxyAccount proxyAccount) {
		RestResponse<CommentResult> result = new RestResponse<CommentResult>(request.getGuid());
		if (proxyAccount.getEnabledCommentReadRole() == false) {
			return result;
		}
		CommentResult res = commontRepository.list(request.getRequest().getHotelId(), request.getRequest().getPageSize(), request
				.getRequest().getPageIndex(), proxyAccount.getCommentUserKey());
		result.setResult(res);
		return result;
	}

	@Override
	public RestResponse<CommentSummaryResult> CommentSummary(RestRequest<CommentSummaryCondition> request, ProxyAccount proxyAccount) {
		RestResponse<CommentSummaryResult> result = new RestResponse<CommentSummaryResult>(request.getGuid());
		if (proxyAccount.getEnabledCommentReadRole() == false) {
			return result;
		}
		String regEx = "^(\\d+,)*\\d+.?$";
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(request.getRequest().getHotelIds());
		if (!matcher.matches()) {
			result.setCode(ErrorCode.Common_IdsFormatWrong);
			return result;
		}
		if (request.getRequest().getHotelIds().split(",").length > 20) {
			result.setCode(ErrorCode.Common_IdsFormatWrong);
			return result;
		}
		CommentSummaryResult res = commontRepository.getSumarries(request.getRequest().getHotelIds(), proxyAccount.getCommentUserKey());
		result.setResult(res);
		return result;
	}

}
