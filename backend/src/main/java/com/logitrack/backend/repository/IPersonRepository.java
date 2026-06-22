package com.logitrack.backend.repository;

import com.logitrack.backend.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IPersonRepository extends JpaRepository<Person, Long> {
}