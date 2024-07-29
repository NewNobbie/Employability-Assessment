package com.riwi.final_assessment.infrastructure.abstract_service;

import com.riwi.final_assessment.api.dto.request.CouponRequest;
import com.riwi.final_assessment.api.dto.response.CouponBasicResponse;
import com.riwi.final_assessment.infrastructure.abstract_service.Crud.Create;
import com.riwi.final_assessment.infrastructure.abstract_service.Crud.Delete;
import com.riwi.final_assessment.infrastructure.abstract_service.Crud.ReadById;
import com.riwi.final_assessment.infrastructure.abstract_service.Crud.Update;

public interface ICouponService extends Create<CouponRequest, CouponBasicResponse>,
                ReadById<CouponBasicResponse, Long>,
                Update<CouponRequest, CouponBasicResponse, Long>, Delete<Long> {
}
