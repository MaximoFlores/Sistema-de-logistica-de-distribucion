package com.logitrack.backend.service;

import com.logitrack.backend.dto.shipment.ShipmentDTO;
import com.logitrack.backend.mapper.Mapper;
import com.logitrack.backend.repository.IShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentService implements IShipmentService{
    @Autowired
    private IShipmentRepository repo;
    @Autowired
    private ICustomerService customerService;

    @Override
    public List<ShipmentDTO> getShipments() {
        return repo.findAll().stream().map(Mapper::toDTO).toList();
    }

    @Override
    public ShipmentDTO createShipment(ShipmentDTO shipmentDTO) {

        return null;
    }

    @Override
    public ShipmentDTO updateShipment(String trackingNumber, ShipmentDTO shipmentDTO) {
        return null;
    }
}
