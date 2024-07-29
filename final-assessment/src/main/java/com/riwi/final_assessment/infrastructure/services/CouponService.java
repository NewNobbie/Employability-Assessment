package com.riwi.final_assessment.infrastructure.services;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.riwi.final_assessment.api.dto.request.CouponRequest;
import com.riwi.final_assessment.api.dto.response.CouponBasicResponse;
import com.riwi.final_assessment.domain.entities.Coupon;
import com.riwi.final_assessment.domain.repositories.CouponRepository;
import com.riwi.final_assessment.infrastructure.abstract_service.ICouponService;
import com.riwi.final_assessment.utils.exceptions.BadRequestException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CouponService implements ICouponService{

    @Autowired
    private CouponRepository couponRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    @Transactional
    public CouponBasicResponse create(CouponRequest rq) {
        Coupon coupon = modelMapper.map(rq, Coupon.class);
        Coupon savedCoupon = couponRepository.save(coupon);
        return modelMapper.map(savedCoupon, CouponBasicResponse.class);
    }

    @Override
    @Transactional(readOnly = true)
    public CouponBasicResponse findById(Long id) {
        Optional<Coupon> couponOptional = couponRepository.findById(id);
        return couponOptional.map(coupon -> modelMapper.map(coupon, CouponBasicResponse.class))
                .orElseThrow(() -> new BadRequestException("Coupon not found with id " + id));
    }

    @Override
    @Transactional
    public CouponBasicResponse update(CouponRequest rq, Long id) {
        Coupon existingCoupon = couponRepository.findById(id)
        .orElseThrow(() -> new BadRequestException("User not found with id " + id));
        modelMapper.map(rq, existingCoupon);
        Coupon updatedCoupon = couponRepository.save(existingCoupon);
        return modelMapper.map(updatedCoupon, CouponBasicResponse.class);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Coupon coupon = couponRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("User not found with id " + id));
        couponRepository.delete(coupon);
    }
    


}
