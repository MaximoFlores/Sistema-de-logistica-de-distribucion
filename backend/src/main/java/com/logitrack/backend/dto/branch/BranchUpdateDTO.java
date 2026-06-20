package com.logitrack.backend.dto.branch;

import com.logitrack.backend.dto.address.AddressDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class BranchUpdateDTO {
    private String name;
    private AddressDTO address;
    private boolean isActive;
}
