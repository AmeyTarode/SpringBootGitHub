package com.csi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue

    private int empId;
    private String empName;
    private String empAddress;
    private long empContactNumber;
    private Date empDOB;
    private String empEmailId;
    private String empPassword;



}
