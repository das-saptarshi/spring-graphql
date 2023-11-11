package com.saptarshi.das.springgraphql.services.implementations;

import com.saptarshi.das.springgraphql.inputs.DepartmentInput;
import com.saptarshi.das.springgraphql.models.Department;
import com.saptarshi.das.springgraphql.repositories.DepartmentRepository;
import com.saptarshi.das.springgraphql.services.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Override
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartment(Long id) {
        final Optional<Department> department = departmentRepository.findById(id);
        if (department.isEmpty()) {
            throw new RuntimeException("Department not found");
        }
        return department.get();
    }

    @Override
    public Department addDepartment(DepartmentInput department) {
        return departmentRepository.save(Department.builder().name(department.getName()).build());
    }
}
