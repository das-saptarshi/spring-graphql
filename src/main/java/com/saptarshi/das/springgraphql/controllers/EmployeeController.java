package com.saptarshi.das.springgraphql.controllers;

import com.saptarshi.das.springgraphql.inputs.EmployeeInput;
import com.saptarshi.das.springgraphql.inputs.UpdateSalaryInput;
import com.saptarshi.das.springgraphql.models.Employee;
import com.saptarshi.das.springgraphql.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @QueryMapping
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @QueryMapping
    public Employee getEmployee(@Argument final Long id) {
        return employeeService.getEmployee(id);
    }

    @QueryMapping
    public List<Employee> getEmployeeByName(@Argument final String name) {
        return employeeService.getEmployeeByName(name);
    }

    @MutationMapping
    public Employee addEmployee(@Argument final EmployeeInput employee) {
        return employeeService.addEmployee(employee);
    }

    @MutationMapping
    public Employee updateSalary(@Argument final UpdateSalaryInput updateSalary) {
        return employeeService.updateSalary(updateSalary);
    }
}
