package com.bridgelabz.service;

import com.bridgelabz.dto.EmployeePayrollDTO;
import com.bridgelabz.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int id);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeeDTO);

    EmployeePayrollData updateEmployeePayrollData(int id, EmployeePayrollDTO employeeDTO);

    void deleteEmployeePayrollData(int id);
}
