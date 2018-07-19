package com.kodilla.patterns22.adapter.company;

import com.kodilla.patterns22.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.kodilla.patterns22.adapter.company.newhrsystem.Employee;
import com.kodilla.patterns22.adapter.company.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor {
    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        CompanySalaryProcessor theProcessor = new CompanySalaryProcessor();
        return theProcessor.calculateSalaries(employees);
    }
}
