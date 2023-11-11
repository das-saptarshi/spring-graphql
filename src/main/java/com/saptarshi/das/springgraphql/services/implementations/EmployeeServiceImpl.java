package com.saptarshi.das.springgraphql.services.implementations;

import com.saptarshi.das.springgraphql.inputs.EmployeeInput;
import com.saptarshi.das.springgraphql.inputs.UpdateSalaryInput;
import com.saptarshi.das.springgraphql.models.Employee;
import com.saptarshi.das.springgraphql.repositories.EmployeeRepository;
import com.saptarshi.das.springgraphql.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Long id) {
        final Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isEmpty()) {
            throw new RuntimeException("Employee Doesn't Exists");
        }
        return employee.get();
    }

    @Override
    public Employee addEmployee(EmployeeInput employee) {
        final Employee employeeToSave = Employee.builder()
                .name(employee.getName())
                .email(employee.getEmail())
                .salary(employee.getSalary())
                .departmentId(employee.getDepartmentId())
                .build();
        return employeeRepository.save(employeeToSave);
    }

    @Override
    public Employee updateSalary(UpdateSalaryInput updateSalary) {
        final Optional<Employee> employee = employeeRepository.findById(updateSalary.getId());
        if (employee.isEmpty()) {
            throw new RuntimeException("Employee not found.");
        }
        employee.get().setSalary(updateSalary.getSalary());
        return employeeRepository.save(employee.get());
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }
}
