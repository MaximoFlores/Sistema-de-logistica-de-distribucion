package com.logitrack.backend.dto.customer;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class CustomerCreateDTO {
    @NotBlank(message = "The name is mandatory")
    private String name;

    @NotBlank(message = "The email is mandatory")
    @Pattern(
            regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$",
            message = "The email address must be in a valid format (example@domain.com)"
    )
    private String email;

    @NotBlank(message = "The phone is mandatory")
    @Pattern(
            regexp = "^\\+?[0-9\\s\\-\\.]{7,15}$",
            message = "The phone number format is invalid"
    )
    private String phone;
}
