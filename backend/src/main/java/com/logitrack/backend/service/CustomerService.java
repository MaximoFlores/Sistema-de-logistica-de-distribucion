package com.logitrack.backend.service;

import com.logitrack.backend.dto.customer.CustomerCreateDTO;
import com.logitrack.backend.dto.customer.CustomerResponseDTO;
import com.logitrack.backend.dto.customer.CustomerUpdateDTO;
import com.logitrack.backend.exception.BusinessException;
import com.logitrack.backend.exception.ResourceNotFoundException;
import com.logitrack.backend.mapper.Mapper;
import com.logitrack.backend.model.Customer;
import com.logitrack.backend.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService implements ICustomerService{

    @Autowired
    private ICustomerRepository repo;

    @Override
    public List<CustomerResponseDTO> getCustomers() {
        return repo.findAll().stream().map(Mapper::toDTO).toList();
    }

    @Override
    public CustomerResponseDTO createCustomer(CustomerCreateDTO customerCreateDTO) {
        if(repo.existsByNameIgnoreCase(customerCreateDTO.getName())) {
            throw new BusinessException("A customer with that name already exists");
        }

        Customer customer = Customer.builder()
                .name(customerCreateDTO.getName())
                .email(customerCreateDTO.getEmail())
                .phone(customerCreateDTO.getPhone())
                .build();

        return Mapper.toDTO(repo.save(customer));
    }

    @Override
    public CustomerResponseDTO getCustomer(Long id) {
        Customer customer = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Customer not found"));
        return Mapper.toDTO(customer);
    }

    @Override
    public CustomerResponseDTO updateCustomer(Long id, CustomerUpdateDTO customerUpdateDTO) {
        Customer customer = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Customer not found"));

        customer.setName(customerUpdateDTO.getName());
        customer.setPhone(customerUpdateDTO.getPhone());
        customer.setEmail(customerUpdateDTO.getEmail());
        return Mapper.toDTO(repo.save(customer));
    }

}
