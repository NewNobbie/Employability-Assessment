package com.riwi.final_assessment.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "product")
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String category;

    private Integer price;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "coupon_id",
            referencedColumnName = "id"
    )
    private Coupon coupon;

}
