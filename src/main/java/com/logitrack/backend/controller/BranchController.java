package com.logitrack.backend.controller;

import com.logitrack.backend.dto.branch.BranchCreateDTO;
import com.logitrack.backend.dto.branch.BranchResponseDTO;
import com.logitrack.backend.dto.branch.BranchUpdateDTO;
import com.logitrack.backend.service.IBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/branches")
public class BranchController {

    @Autowired
    private IBranchService branchService;

    @GetMapping("/")
    public ResponseEntity<List<BranchResponseDTO>> getBranches(){

        return ResponseEntity.ok(branchService.getBranches());
    }

    @PostMapping("/")
    public ResponseEntity<BranchResponseDTO> createBranch(@RequestBody BranchCreateDTO dto){
        BranchResponseDTO created = branchService.createBranch(dto);

        return ResponseEntity.created(URI.create("api/branches/" + created.getId())).body(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BranchResponseDTO> getBranch(@PathVariable Long id) {
        return ResponseEntity.ok(branchService.getBranch(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<BranchResponseDTO> updateBranch(@PathVariable Long id, @RequestBody BranchUpdateDTO dto) {
        return ResponseEntity.ok(branchService.updateBranch(id, dto));
    }
}
