package com.riwi.final_assessment.infrastructure.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.riwi.final_assessment.api.dto.request.CouponHistoryRequest;
import com.riwi.final_assessment.api.dto.response.CouponBasicResponse;
import com.riwi.final_assessment.domain.entities.Coupon;
import com.riwi.final_assessment.domain.entities.CouponHistory;
import com.riwi.final_assessment.domain.repositories.CouponHistoryRepository;
import com.riwi.final_assessment.domain.repositories.CouponRepository;
import com.riwi.final_assessment.infrastructure.abstract_service.ICouponHistoryService;

public class CouponHistoryService implements ICouponHistoryService{

    @Autowired
    private CouponHistoryRepository couponHistoryRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CouponBasicResponse create(CouponHistoryRequest rq) {
        CouponHistory couponHistory = modelMapper.map(rq, CouponHistory.class);
        CouponHistory couponHistorySaved = couponHistoryRepository.save(couponHistory);
        return modelMapper.map(couponHistorySaved, CouponBasicResponse.class);
    }
    
}
