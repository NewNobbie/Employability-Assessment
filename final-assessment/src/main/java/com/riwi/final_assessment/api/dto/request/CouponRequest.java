package com.riwi.final_assessment.api.dto.request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponRequest {

    @NotNull(message = "Status is required")
    private Boolean Status;
    @NotNull(message = "Discount is required")
    private Integer Discount_Porcent;
    @NotNull(message = "Expiration date is required")
    private LocalDateTime Expiration_Date;
    @NotNull(message = "Product id is required")
    private Long product_id;

}
