package com.riwi.final_assessment.api.dto.request;

import com.riwi.final_assessment.utils.enums.Category;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    
    @NotBlank(message = "Name is required") @Size(min = 0, max = 40  )
    private String name;

    @NotNull
    private Category category;
    
    @NotNull
    private Integer price;
}
