package com.logitrack.backend.service;

import com.logitrack.backend.dto.shipment.ShipmentDTO;

import java.util.List;

public interface IShipmentService {

    List<ShipmentDTO> getShipments();
    ShipmentDTO createShipment(ShipmentDTO shipmentDTO);
    ShipmentDTO updateShipment(String trackingNumber, ShipmentDTO shipmentDTO);
}
