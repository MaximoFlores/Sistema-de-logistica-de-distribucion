package com.logitrack.backend.dto.customer;

import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class CustomerResponseDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private LocalDateTime createdAt;
}
