package com.logitrack.backend.mapper;

import com.logitrack.backend.dto.address.AddressDTO;
import com.logitrack.backend.dto.customer.CustomerResponseDTO;
import com.logitrack.backend.dto.person.PersonResponseDTO;
import com.logitrack.backend.dto.shipment.ShipmentDTO;
import com.logitrack.backend.dto.branch.BranchResponseDTO;
import com.logitrack.backend.model.*;

public class Mapper {

    // Mapeo de Branch a BranchDTO
    public static BranchResponseDTO toDTO(Branch branch) {
        if (branch == null) return null;

        return BranchResponseDTO.builder()
                .id(branch.getId())
                .name(branch.getName())
                .address(toDTO(branch.getAddress()))
                .isActive(branch.getIsActive())
                .createdAt(branch.getCreatedAt())
                .build();
    }
    // Mapeo de Address a AddressDTO
    public static AddressDTO toDTO(Address address) {
        if (address == null) return null;
        return AddressDTO.builder()
                .number(address.getNumber())
                .street(address.getStreet())
                .locality(address.getLocality())
                .province(address.getProvince())
                .country(address.getCountry())
                .postalCode(address.getPostalCode())
                .build();
    }
    // Mapeo de AddressDTO a Address
    public static Address toEntity(AddressDTO dto) {
        if (dto == null) return null;

        return Address.builder()
                .number(dto.getNumber())
                .street(dto.getStreet())
                .locality(dto.getLocality())
                .province(dto.getProvince())
                .country(dto.getCountry())
                .postalCode(dto.getPostalCode())
                .build();
    }
    // Mapeo de Customer a CustomerDTO
    public static CustomerResponseDTO toDTO(Customer customer) {
        if (customer == null) return null;

        return CustomerResponseDTO.builder()
                .id(customer.getId())
                .name(customer.getName())
                .email(customer.getEmail())
                .phone(customer.getPhone())
                .createdAt(customer.getCreatedAt())
                .build();
    }
    // Mapeo de Shipment a ShipmentDTO
    public static ShipmentDTO toDTO(Shipment shipment) {
        if(shipment == null) return null;

        return ShipmentDTO.builder()
                .trackingNumber(shipment.getTrackingNumber())
                .customer(shipment.getCustomer())
                .sender(shipment.getSender())
                .recipient(shipment.getRecipient())
                .destinationAddress(shipment.getDestinationAddress())
                .originAddress(shipment.getOriginAddress())
                .status(shipment.getStatus())
                .build();
    }

    public static PersonResponseDTO toDTO(Person person) {
        return PersonResponseDTO.builder()
                .id(person.getId())
                .name(person.getFullName())
                .documentNumber(person.getDocument())
                .email(person.getEmail())
                .phone(person.getPhone())
                .build();
    }
}
