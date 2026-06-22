package com.logitrack.backend.service;

import com.logitrack.backend.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements IPersonService{
    @Autowired
    IPersonRepository repo;


}
