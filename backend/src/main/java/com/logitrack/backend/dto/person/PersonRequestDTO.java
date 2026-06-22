package com.logitrack.backend.dto.person;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class PersonRequestDTO {
    @NotBlank
    @Size(max = 200, message = "The maximum first name length is 200 characters.")
    private String firstName;

    @NotBlank
    @Size(max = 200, message = "The maximum last name length is 200 characters.")
    private String lastName;

    @NotBlank(message = "The phone is mandatory")
    @Pattern(
            regexp = "^\\+?[0-9\\s\\-\\.]{7,15}$",
            message = "The phone number format is invalid"
    )
    private String phone;

    @NotBlank(message = "The email is mandatory")
    @Pattern(
            regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$",
            message = "The email address must be in a valid format (example@domain.com)"
    )
    private String email;

    @NotBlank
    private String documentNumber;
}
