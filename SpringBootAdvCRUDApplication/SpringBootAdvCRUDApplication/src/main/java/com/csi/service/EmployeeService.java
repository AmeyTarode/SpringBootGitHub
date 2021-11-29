package com.csi.service;

import com.csi.model.Employee;

import java.util.List;

public interface EmployeeService {

    public void signup (Employee employee);

    public boolean signin(String empEmailId , String empPassword);

    public void saveAllData(List<Employee> employees);

    public List<Employee> getAllData();

    public Employee getDataById(int empId);

    public Employee getDataById(String empName);

    public void updateData(int empId , Employee employee);

    public void deleteData(int empId);

    public void deleteAllData();
}
