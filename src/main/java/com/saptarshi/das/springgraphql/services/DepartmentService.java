package com.saptarshi.das.springgraphql.services;

import com.saptarshi.das.springgraphql.inputs.DepartmentInput;
import com.saptarshi.das.springgraphql.models.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getDepartments();
    Department getDepartment(Long id);
    Department addDepartment(DepartmentInput department);
}
