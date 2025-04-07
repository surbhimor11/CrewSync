
package com.crewsync.controller;

import com.crewsync.model.Leave;
import com.crewsync.repository.LeaveRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leaves")
public class LeaveController {

    private final LeaveRepository repo;

    public LeaveController(LeaveRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Leave applyLeave(@RequestBody Leave leave) {
        leave.setStatus("Pending");
        return repo.save(leave);
    }

    @GetMapping("/employee/{id}")
    public List<Leave> getLeavesByEmployee(@PathVariable Long id) {
        return repo.findByEmployeeId(id);
    }

    @PutMapping("/{id}/status")
    public Leave updateLeaveStatus(@PathVariable Long id, @RequestParam String status) {
        Leave leave = repo.findById(id).orElseThrow();
        leave.setStatus(status);
        return repo.save(leave);
    }
}
