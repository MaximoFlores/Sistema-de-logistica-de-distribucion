package com.logitrack.backend.dto.person;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class PersonResponseDTO {
    private Long id;
    private String name;
    private String phone;
    private String documentNumber;
    private String email;
}
