package com.logitrack.backend.model;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
@Embeddable
public class Address {

    private Integer number;
    private String street;
    private String locality;
    private String province;
    private String country;
    private String postalCode;
}