package com.logitrack.backend.dto.person;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder
public class PersonCreateDTO {

    @NotBlank(message = "The full name is mandatory")
    @Size(max = 255, message = "The maximum length of the name is 255")
    private String fullName;

    @NotBlank(message = "The document number is mandatory")
    @Size(max = 50, message = "The maximum length of the document number is 50")
    private String documentNumber;

    @NotBlank(message = "The phone number is mandatory")
    @Pattern(
            regexp = "^\\+?[0-9\\s\\-\\.]{7,15}$",
            message = "The phone number is invalid"
    )
    private String phone;

    @NotBlank
    @Pattern(
            regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$",
            message = "The email format is invalid.(example@domain.com)"
    )
    private String email;
}
