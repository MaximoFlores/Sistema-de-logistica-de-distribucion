package com.logitrack.backend.repository;

import com.logitrack.backend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
    boolean existsByNameIgnoreCase(String name);
}