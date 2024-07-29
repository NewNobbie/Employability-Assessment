package com.riwi.final_assessment.api.dto.request;

import jakarta.validation.constraints.NotNull;

public class CouponHistoryRequest {

    @NotNull(message = "Product id is required")
    private Long product_id;
    @NotNull(message = "Product id is required")
    private Long user_id;
    
}
