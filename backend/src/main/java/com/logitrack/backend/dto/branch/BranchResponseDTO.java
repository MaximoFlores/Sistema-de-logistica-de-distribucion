package com.logitrack.backend.dto.branch;

import com.logitrack.backend.dto.address.AddressDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
@Builder
public class BranchResponseDTO {
    private Long id;
    private String name;
    private AddressDTO address;
    private boolean isActive;
    private LocalDateTime createdAt;
}
