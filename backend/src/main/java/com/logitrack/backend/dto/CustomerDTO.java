package com.logitrack.backend.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;
}
