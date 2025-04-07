
package com.crewsync.controller;

import com.crewsync.model.Employee;
import com.crewsync.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeRepository repo;

    public EmployeeController(EmployeeRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Employee> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return repo.save(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee updated) {
        Employee employee = repo.findById(id).orElseThrow();
        employee.setName(updated.getName());
        employee.setDepartment(updated.getDepartment());
        employee.setEmail(updated.getEmail());
        return repo.save(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
