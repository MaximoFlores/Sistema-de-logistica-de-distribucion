package com.logitrack.backend.controller;

import com.logitrack.backend.dto.customer.CustomerCreateDTO;
import com.logitrack.backend.dto.customer.CustomerResponseDTO;
import com.logitrack.backend.dto.customer.CustomerUpdateDTO;
import com.logitrack.backend.service.ICustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping
    public ResponseEntity<List<CustomerResponseDTO>> getCustomers() {
        return ResponseEntity.ok(customerService.getCustomers());
    }

    @PostMapping
    public ResponseEntity<CustomerResponseDTO> createCustomer(@Valid @RequestBody CustomerCreateDTO dto) {
        CustomerResponseDTO customer = customerService.createCustomer(dto);
        return ResponseEntity.created(URI.create("/customers/" + customer.getId())).body(customer);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponseDTO> getCustomer(@PathVariable Long id) {
        return ResponseEntity.ok(customerService.getCustomer(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerResponseDTO> updateCustomer(@PathVariable Long id, @Valid @RequestBody CustomerUpdateDTO dto) {
        return ResponseEntity.ok(customerService.updateCustomer(id, dto));
    }
}
