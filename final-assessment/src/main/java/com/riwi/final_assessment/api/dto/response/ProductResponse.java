package com.riwi.final_assessment.api.dto.response;

import com.riwi.final_assessment.utils.enums.Category;

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
public class ProductResponse {
    
    private Long id;
    private String name;
    private Category category;
    private Integer price;

}
