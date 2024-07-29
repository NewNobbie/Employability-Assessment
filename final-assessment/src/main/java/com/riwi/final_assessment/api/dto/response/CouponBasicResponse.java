package com.riwi.final_assessment.api.dto.response;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class CouponBasicResponse {

    private String id;
    private Boolean Status;
    private Integer Discount_Porcent;
    private LocalDateTime Expiration_Date;

}
