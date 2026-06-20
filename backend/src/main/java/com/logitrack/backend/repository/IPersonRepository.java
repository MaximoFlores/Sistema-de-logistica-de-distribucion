package com.logitrack.backend.repository;

import com.logitrack.backend.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IPersonRepository extends JpaRepository<Person, UUID> {
}