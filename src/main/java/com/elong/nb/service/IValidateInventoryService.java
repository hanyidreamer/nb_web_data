package com.elong.nb.service;

import java.io.IOException;

import com.elong.nb.common.model.RestRequest;
import com.elong.nb.common.model.RestResponse;
import com.elong.nb.model.inventory.ValidateInventoryCondition;
import com.elong.nb.model.inventory.ValidateInventoryResult;

public interface IValidateInventoryService {

	RestResponse<ValidateInventoryResult> getValidateInventories(
			RestRequest<ValidateInventoryCondition> restRequest) throws IOException, Exception;

}
