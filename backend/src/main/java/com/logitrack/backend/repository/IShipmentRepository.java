package com.logitrack.backend.repository;

import com.logitrack.backend.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IShipmentRepository extends JpaRepository<Shipment, UUID> {
}