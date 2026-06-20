package com.logitrack.backend.service;

import com.logitrack.backend.dto.branch.BranchCreateDTO;
import com.logitrack.backend.dto.branch.BranchResponseDTO;
import com.logitrack.backend.dto.branch.BranchUpdateDTO;

import java.util.List;

public interface IBranchService {

    List<BranchResponseDTO> getBranches();

    BranchResponseDTO getBranch(Long id);

    BranchResponseDTO createBranch(BranchCreateDTO branchDTO);

    BranchResponseDTO updateBranch(Long id, BranchUpdateDTO branchDTO);

}
