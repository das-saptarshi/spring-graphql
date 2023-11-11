package com.saptarshi.das.springgraphql.repositories;

import com.saptarshi.das.springgraphql.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByName(String name);
}
