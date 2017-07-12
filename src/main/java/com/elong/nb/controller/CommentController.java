package com.elong.nb.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elong.nb.UserServiceAgent;
import com.elong.nb.common.gson.GsonUtil;
import com.elong.nb.common.model.ProxyAccount;
import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.common.util.ValidateUtil;
import com.elong.nb.model.comment.CommentCondition;
import com.elong.nb.model.comment.CommentResult;
import com.elong.nb.model.comment.CommentSummaryCondition;
import com.elong.nb.model.comment.CommentSummaryResult;
import com.elong.nb.service.ICommentService;

@Controller
public class CommentController {
	@Resource
	private ICommentService commentService;

	/**
	 * 请求点评服务，需要先开权限
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/api/Hotel/ListComments", method = RequestMethod.POST)
	public ResponseEntity<byte[]> getListComments(HttpServletRequest request) throws IOException {
		String userName = request.getHeader("userName");
		ProxyAccount proxyAccount = UserServiceAgent.findProxyByUsername(userName);
		RestRequest<CommentCondition> restRequest = GsonUtil.toReq(request, CommentCondition.class, null);
		// 基本校验
		String rst = restRequest.getRequest().validateCondition().toString();
		if (StringUtils.isNotBlank(rst)) {
			RestResponse<CommentResult> response = new RestResponse<CommentResult>(restRequest.getGuid());
			response.setCode(rst);
			return new ResponseEntity<byte[]>(GsonUtil.toJson(response, restRequest.getVersion() == null ? 0d : restRequest.getVersion())
					.getBytes(), HttpStatus.OK);
		}
		// 调用Service
		RestResponse<CommentResult> response = commentService.ListComments(restRequest, proxyAccount);
		// 反回JSON
		return new ResponseEntity<byte[]>(GsonUtil.toJson(response, restRequest.getVersion()).getBytes(), HttpStatus.OK);

	}

	/**
	 * 请求酒店点评摘要，需要先开权限
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/api/Hotel/ListCommentSummaries", method = RequestMethod.POST)
	public ResponseEntity<byte[]> getListCommentSummaries(HttpServletRequest request) throws IOException {
		String userName = request.getHeader("userName");
		ProxyAccount proxyAccount = UserServiceAgent.findProxyByUsername(userName);
		RestRequest<CommentSummaryCondition> restRequest = GsonUtil.toReq(request, CommentSummaryCondition.class, null);
		// 基本校验
		StringBuffer sb = new StringBuffer(ValidateUtil.validateRestRequest(restRequest, proxyAccount));
		String rst = sb.toString();
		if (StringUtils.isNotBlank(rst)) {
			RestResponse<CommentSummaryResult> response = new RestResponse<CommentSummaryResult>(restRequest.getGuid());
			response.setCode(rst);
			return new ResponseEntity<byte[]>(GsonUtil.toJson(response, restRequest.getVersion() == null ? 0d : restRequest.getVersion())
					.getBytes(), HttpStatus.OK);
		}
		// 调用Service
		RestResponse<CommentSummaryResult> response = commentService.CommentSummary(restRequest, proxyAccount);
		// 反回JSON
		return new ResponseEntity<byte[]>(GsonUtil.toJson(response, restRequest.getVersion()).getBytes(), HttpStatus.OK);

	}
}
