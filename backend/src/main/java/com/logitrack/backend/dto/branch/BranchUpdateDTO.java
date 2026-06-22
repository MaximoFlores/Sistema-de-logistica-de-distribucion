package com.logitrack.backend.dto.branch;

import com.logitrack.backend.dto.address.AddressDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class BranchUpdateDTO {
    @NotBlank(message = "The name is mandatory")
    @Size(max = 100)
    private String name;

    @NotNull
    @Valid
    private AddressDTO address;

    @NotNull
    private Boolean isActive;
}
