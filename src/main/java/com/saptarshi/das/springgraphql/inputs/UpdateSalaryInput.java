package com.saptarshi.das.springgraphql.inputs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateSalaryInput {
    private Long id;
    private Long salary;
}
