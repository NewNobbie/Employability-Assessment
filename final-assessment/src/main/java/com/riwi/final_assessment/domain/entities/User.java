package com.riwi.final_assessment.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "user")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String cc;

    private String name;

    private String phone;

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )
    private List<Coupon> coupons;

    @OneToMany(
        fetch = FetchType.LAZY,
        mappedBy = "user",
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<CouponHistory> couponsHistories;


}
