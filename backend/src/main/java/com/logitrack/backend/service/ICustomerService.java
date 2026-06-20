package com.logitrack.backend.service;

import com.logitrack.backend.dto.CustomerDTO;
import com.logitrack.backend.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICustomerService {
    List<CustomerDTO> getCustomers();

    CustomerDTO createCustomer(CustomerDTO customerDTO);

    CustomerDTO getCustomer(Long id);

    CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO);

}
