package com.logitrack.backend.service;

import com.logitrack.backend.dto.branch.BranchCreateDTO;
import com.logitrack.backend.dto.branch.BranchResponseDTO;
import com.logitrack.backend.dto.branch.BranchUpdateDTO;
import com.logitrack.backend.exception.BusinessException;
import com.logitrack.backend.exception.ResourceNotFoundException;
import com.logitrack.backend.mapper.Mapper;
import com.logitrack.backend.model.Branch;
import com.logitrack.backend.repository.IBranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService implements IBranchService{

    @Autowired
    private IBranchRepository repo;

    @Override
    public List<BranchResponseDTO> getBranches() {
        return repo.findAll().stream().map(Mapper::toDTO).toList();
    }

    @Override
    public BranchResponseDTO getBranch(Long id) {
        Branch branch = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Branch not found"));
        return Mapper.toDTO(branch);
    }

    @Override
    public BranchResponseDTO createBranch(BranchCreateDTO branchCreateDTO) {
        if(repo.existsByNameIgnoreCase(branchCreateDTO.getName())) {
            throw new BusinessException("A branch with that name already exists");
        }
        Branch branch = Branch.builder()
                .name(branchCreateDTO.getName())
                .isActive(branchCreateDTO.isActive())
                .address(Mapper.toEntity(branchCreateDTO.getAddress()))
                .build();

        return Mapper.toDTO(repo.save(branch));
    }

    @Override
    public BranchResponseDTO updateBranch(Long id, BranchUpdateDTO branchUpdateDTO) {
        Branch branch = repo.findById(id)
                .orElseThrow( () -> new ResourceNotFoundException("branch not found"));
        if(repo.existsByNameIgnoreCase(branchUpdateDTO.getName())) {
            throw new BusinessException("A branch with that name already exists");
        }

        branch.setName(branchUpdateDTO.getName());
        branch.setAddress(Mapper.toEntity(branchUpdateDTO.getAddress()));
        branch.setIsActive(branchUpdateDTO.getIsActive());

        return Mapper.toDTO(repo.save(branch));
    }
}
