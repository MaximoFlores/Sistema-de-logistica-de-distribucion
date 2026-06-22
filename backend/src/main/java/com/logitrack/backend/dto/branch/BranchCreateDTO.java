package com.logitrack.backend.dto.branch;

import com.logitrack.backend.dto.address.AddressDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Builder
public class BranchCreateDTO {
    @NotBlank(message = "The name is mandatory")
    @Size(max = 100, message = "The name cannot exceed 100 characters")
    private String name;

    @NotNull(message = "The address is mandatory")
    @Valid
    private AddressDTO address;
    private boolean isActive;
}
