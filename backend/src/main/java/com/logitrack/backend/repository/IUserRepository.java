package com.logitrack.backend.repository;

import com.logitrack.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface IUserRepository extends JpaRepository<User, UUID> {
}