package com.logitrack.backend.dto.branch;

import com.logitrack.backend.model.Address;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Builder
public class BranchCreateDTO {
    private String name;
    private Address address;
    private boolean isActive;
}
