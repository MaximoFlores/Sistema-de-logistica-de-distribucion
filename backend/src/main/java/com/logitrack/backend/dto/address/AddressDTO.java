package com.logitrack.backend.dto.address;

import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder
public class AddressDTO {
    private Integer number;
    private String street;
    private String locality;
    private String province;
    private String country;
    private String postalCode;
}
