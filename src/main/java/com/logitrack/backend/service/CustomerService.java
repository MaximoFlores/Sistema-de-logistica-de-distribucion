package com.logitrack.backend.service;

import com.logitrack.backend.dto.CustomerDTO;
import com.logitrack.backend.exception.NotFoundException;
import com.logitrack.backend.mapper.Mapper;
import com.logitrack.backend.model.Customer;
import com.logitrack.backend.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService{

    @Autowired
    private ICustomerRepository repo;

    @Override
    public List<CustomerDTO> getCustomers() {
        return repo.findAll().stream().map(Mapper::toDTO).toList();
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        Customer customer = Customer.builder()
                .name(customerDTO.getName())
                .email(customerDTO.getEmail())
                .phone(customerDTO.getPhone())
                .build();

        return Mapper.toDTO(repo.save(customer));
    }

    @Override
    public CustomerDTO getCustomer(Long id) {
        Customer customer = repo.findById(id).orElseThrow(() -> new NotFoundException("Customer not found"));
        return Mapper.toDTO(customer);
    }

    @Override
    public CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO) {
        Customer customer = repo.findById(id).orElseThrow(() -> new NotFoundException("Customer not found"));

        customer.setName(customerDTO.getName());
        customer.setPhone(customerDTO.getPhone());
        customer.setEmail(customerDTO.getEmail());
        return Mapper.toDTO(repo.save(customer));
    }

}
