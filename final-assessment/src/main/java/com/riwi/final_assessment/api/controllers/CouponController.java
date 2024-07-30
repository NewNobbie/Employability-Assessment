package com.riwi.final_assessment.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.final_assessment.api.dto.request.CouponRequest;
import com.riwi.final_assessment.api.dto.response.CouponBasicResponse;
import com.riwi.final_assessment.infrastructure.abstract_service.ICouponService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/coupon")
@AllArgsConstructor
public class CouponController {
    @Autowired
    private final ICouponService iCouponService;

    @GetMapping("/{id}")
    public ResponseEntity<CouponBasicResponse> getCouponById(@PathVariable Long id) {
        CouponBasicResponse couponResponse = iCouponService.findById(id);
        return ResponseEntity.ok(couponResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCoupon(@PathVariable Long id) {
        iCouponService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<CouponBasicResponse> updateCoupon(@RequestBody CouponRequest couponRequest, @PathVariable Long id) {
        CouponBasicResponse updatedCouponResponse = iCouponService.update(couponRequest, id);
        return ResponseEntity.ok(updatedCouponResponse);
    }

    @PostMapping
    public ResponseEntity<CouponBasicResponse> createCoupon(@RequestBody CouponRequest couponRequest) {
        CouponBasicResponse createdCouponResponse = iCouponService.create(couponRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCouponResponse);
    }
}
