package com.logitrack.backend.service;

import com.logitrack.backend.dto.customer.CustomerResponseDTO;
import com.logitrack.backend.dto.customer.CustomerCreateDTO;
import com.logitrack.backend.dto.customer.CustomerUpdateDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICustomerService {
    List<CustomerResponseDTO> getCustomers();

    CustomerResponseDTO createCustomer(CustomerCreateDTO customerCreateDTO);

    CustomerResponseDTO getCustomer(Long id);

    CustomerResponseDTO updateCustomer(Long id, CustomerUpdateDTO customerUpdateDTO);

}
