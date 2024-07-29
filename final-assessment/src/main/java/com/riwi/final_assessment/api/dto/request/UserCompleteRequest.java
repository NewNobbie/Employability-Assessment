package com.riwi.final_assessment.api.dto.request;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class UserCompleteRequest extends UserBasicRequest{

    @Pattern(regexp = "^[0-9]+$", message = "The number must be contain only digits")
    @Size(min = 7, max = 15, message = "The cell phone number must be between 7 and 15 digits")
    private String phone;

    @Size(max = 43)
    private String name;
    
}
