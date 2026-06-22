package com.logitrack.backend.dto.address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder
public class AddressDTO {
    @NotBlank
    @Size(max = 100)
    private String street;

    @NotBlank
    @Size(max = 10)
    private int number;

    @NotBlank
    @Size(max = 100)
    private String locality;

    @NotBlank
    @Size(max = 100)
    private String province;

    @NotBlank
    @Pattern(
            regexp = "\\d{4,8}",
            message = "Invalid postal code"
    )
    private String postalCode;

    @NotBlank
    @Size(max = 100)
    private String country;
}
