package com.logitrack.backend.dto;

import com.logitrack.backend.model.Address;
import com.logitrack.backend.model.Customer;
import com.logitrack.backend.model.Person;
import com.logitrack.backend.util.ShipmentStatus;
import lombok.*;

@Setter @Getter
@AllArgsConstructor @NoArgsConstructor
@Builder
public class ShipmentDTO {

    private String trackingNumber;
    private Customer customer;
    private Person sender;
    private Person recipient;
    private Address originAddress;
    private Address destinationAddress;
    private ShipmentStatus status;


}
