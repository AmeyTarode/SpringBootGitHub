package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/signup")
    public String signup(@RequestBody Employee employee)
    {
        employeeService.signup(employee);
        return "Signup Successful";
    }

    @GetMapping("/service/{empEmailId}/{empPassword}")
    public boolean signin(@PathVariable String empEmailId , String empPassword)
    {
        return employeeService.signin(empEmailId , empPassword);
    }

    @GetMapping("/getalldata")

    public List<Employee> getalldata()
    {
        return employeeService.getAllData();
    }

    @GetMapping("/getdatabyid/{empId}")
    public Employee getDataById(@PathVariable int empId)
    {

        return  employeeService.getDataById(empId);
    }

    @GetMapping("/getdatabyName/{empName}")
    public Employee getDataByName(@PathVariable int empName)
    {
        return employeeService.getDataById(empName);
    }
    @PostMapping("/savealldata")
    public String saveallData(@RequestBody List<Employee> employees)
    {
        employeeService.saveAllData(employees);
        return "Save All Data Done";
    }
    @PutMapping("/updatedata/{empId}")
    public String updatedata(@PathVariable int empId,@RequestBody Employee employee)
    {
        employeeService.updateData(empId, employee);
        return"Data Update Successfully";
    }
    @DeleteMapping("/deletemapping/{empId}")
    public String deleteData(@PathVariable int empId)
    {
        employeeService.deleteData(empId);
        return"Date Deleted Successfully";
    }
    @DeleteMapping("/deleteAlldata")
    public String deleteAllData()
    {
        employeeService.deleteAllData();
        return"All Data Deleted Successfully";
    }

}
