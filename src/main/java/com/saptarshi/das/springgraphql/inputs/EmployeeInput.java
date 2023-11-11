package com.saptarshi.das.springgraphql.inputs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeInput {
    private String name;
    private String email;
    private Long salary;
    private Long departmentId;
}
