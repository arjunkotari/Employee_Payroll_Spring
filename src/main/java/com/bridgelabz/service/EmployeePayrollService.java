package com.bridgelabz.service;

import com.bridgelabz.dto.EmployeePayrollDTO;
import com.bridgelabz.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{

    private List<EmployeePayrollData> empList = new ArrayList<>();

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return empList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int id) {
        return empList.get(id-1);
    }
    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeeDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(empList.size()+1, employeeDTO);
        empList.add(empData);
        return empData;
    }
    @Override
    public EmployeePayrollData updateEmployeePayrollData(int id, EmployeePayrollDTO employeeDTO) {
        EmployeePayrollData empData = this.getEmployeePayrollDataById(id);
        empData.setName(employeeDTO.name);
        empData.setSalary(employeeDTO.salary);
        empList.set(id-1, empData);
        return empData;
    }

    @Override
    public void deleteEmployeePayrollData(int id) {
        empList.remove(id-1);
    }
}
