package com.saptarshi.das.springgraphql.repositories;

import com.saptarshi.das.springgraphql.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
