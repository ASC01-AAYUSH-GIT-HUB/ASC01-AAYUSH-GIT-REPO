package org.demo.controller;

import org.demo.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/var/v1")
public class EmployeeControllerUsingModel {
    @GetMapping("/getHTMLCon")
    public String getContent(){
        String htmlOutput="<html><head><title>Employee List</title></head><body><h1>Employee List</h1><p style=\"color:red;\">This is a simple HTML response from the EmployeeController.</p></body></html>";
        return htmlOutput;
    }



    @GetMapping("/getEmpAsList")
    public List<Employee> getEmployeeAsList(){
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1,"Alice"));
        employees.add(new Employee(2,"Chutiya"));
        return  employees;
    }
    @GetMapping("/getEmpAsMap")
    public Map<Integer,Employee> getEmployeeAsMap(){
        Map<Integer, Employee> employeeMap=new HashMap<>();
        employeeMap.put(1,new Employee(1,"Aayush"));
        employeeMap.put(2,new Employee(2,"Prasad"));
        return employeeMap;
    }

}
