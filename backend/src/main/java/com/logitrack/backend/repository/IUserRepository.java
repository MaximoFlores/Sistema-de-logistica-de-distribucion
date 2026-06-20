package com.logitrack.backend.repository;

import com.logitrack.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUserRepository extends JpaRepository<User, UUID> {
}