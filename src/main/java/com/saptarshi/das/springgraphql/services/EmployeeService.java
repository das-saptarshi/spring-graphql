package com.saptarshi.das.springgraphql.services;

import com.saptarshi.das.springgraphql.inputs.EmployeeInput;
import com.saptarshi.das.springgraphql.inputs.UpdateSalaryInput;
import com.saptarshi.das.springgraphql.models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();
    Employee getEmployee(Long id);
    Employee addEmployee(EmployeeInput employee);
    Employee updateSalary(UpdateSalaryInput updateSalary);
    List<Employee> getEmployeeByName(String name);
}
