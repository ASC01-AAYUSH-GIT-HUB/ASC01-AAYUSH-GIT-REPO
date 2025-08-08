package org.demo.controller;

import org.demo.entity.EmployeeEntity;
import org.demo.sevices.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/var/v2")
public class EmployeeControllerUsingEntity  {
    private final EmployeeService employeeService;
    @Autowired
    public EmployeeControllerUsingEntity(EmployeeService employeeService){
        this.employeeService=employeeService;
    }
    @GetMapping("/emp")
    List<EmployeeEntity> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

}
