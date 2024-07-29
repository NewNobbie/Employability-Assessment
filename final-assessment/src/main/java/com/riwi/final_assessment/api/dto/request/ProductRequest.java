package com.riwi.final_assessment.api.dto.request;

import com.riwi.final_assessment.utils.enums.Category;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
public class ProductRequest {
    
    @NotBlank(message = "Name is required") @Size(min = 0, max = 40  )
    private String name;

    @NotNull(message = "Category is required")
    private Category category;

    @NotNull(message = "Price is required")
    private Integer price;
}
