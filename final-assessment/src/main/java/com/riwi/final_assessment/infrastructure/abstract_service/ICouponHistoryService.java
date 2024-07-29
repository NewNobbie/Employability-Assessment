package com.riwi.final_assessment.infrastructure.abstract_service;

import com.riwi.final_assessment.api.dto.request.CouponHistoryRequest;
import com.riwi.final_assessment.api.dto.response.CouponBasicResponse;
import com.riwi.final_assessment.infrastructure.abstract_service.Crud.Create;

public interface ICouponHistoryService extends Create<CouponHistoryRequest, CouponBasicResponse> {
    
}
