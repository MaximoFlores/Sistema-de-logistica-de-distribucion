package com.logitrack.backend.repository;

import com.logitrack.backend.model.Branch;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBranchRepository extends JpaRepository<Branch, Long> {
    boolean existsByNameIgnoreCase(String name);
}