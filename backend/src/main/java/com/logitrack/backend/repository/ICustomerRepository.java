package com.logitrack.backend.repository;

import com.logitrack.backend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}