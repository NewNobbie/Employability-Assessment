package com.riwi.final_assessment.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "coupon_history")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coupon_id", referencedColumnName = "id")
    private Coupon coupon;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

}
