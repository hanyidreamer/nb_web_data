package com.elong.nb.service;

import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.comment.CommentCondition;
import com.elong.nb.model.comment.CommentResult;
import com.elong.nb.model.comment.CommentSummaryCondition;
import com.elong.nb.model.comment.CommentSummaryResult;

public interface ICommentService {
	RestResponse<CommentResult> ListComments(RestRequest<CommentCondition> request);
	RestResponse<CommentSummaryResult> CommentSummary(RestRequest<CommentSummaryCondition> request);
}
