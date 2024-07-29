package com.riwi.final_assessment.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.final_assessment.domain.entities.Coupon;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, String> {
    
}
