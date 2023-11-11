package com.saptarshi.das.springgraphql.controllers;

import com.saptarshi.das.springgraphql.inputs.DepartmentInput;
import com.saptarshi.das.springgraphql.models.Department;
import com.saptarshi.das.springgraphql.services.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;

    @QueryMapping
    public List<Department> getDepartments() {
        return departmentService.getDepartments();
    }

    @QueryMapping
    public Department getDepartment(@Argument final Long id) {
        return departmentService.getDepartment(id);
    }

    @MutationMapping
    public Department addDepartment(@Argument final DepartmentInput department) {
        return departmentService.addDepartment(department);
    }
}
