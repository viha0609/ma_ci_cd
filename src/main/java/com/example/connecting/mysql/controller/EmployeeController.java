package com.example.connecting.mysql.controller;


import com.example.connecting.mysql.model.Employee;
import com.example.connecting.mysql.repository.EmployeeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeRepo repo;

    @GetMapping("/getEmployee")
    public List<Employee> getAllEmployee() {
        return repo.findAll();
    }

    @PostMapping("/createEmployee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return repo.save(employee);
    }
}
