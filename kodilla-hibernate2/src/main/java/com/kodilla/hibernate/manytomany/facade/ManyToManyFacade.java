package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManyToManyFacade {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(ManyToManyFacade.class);

    public List<Employee> searchEmployee(final String employeeName) {
        if (employeeName != null) {
            LOGGER.info("Searching employee by: " + employeeName);
            List<Employee> employeeNames = employeeDao.findEmployeeByLastname(employeeName);
            LOGGER.info("Employees founded: ");
            for(Employee employees : employeeNames) {
                LOGGER.info(employees.getFirstname() + " " + employees.getLastname());
            }
            return employeeNames;
        } else {
            LOGGER.error("There isn't any employees founded");
        }
        return new ArrayList<>();
    }

    public List<Company> searchCompany(final String companyName) {
        if (companyName != null) {
            LOGGER.info("Searching company by: " + companyName);
            List<Company> companyNames = companyDao.searchByCompanyName(companyName);
            LOGGER.info("Companies founded: ");
            for(Company company : companyNames) {
                LOGGER.info(companyName);
            }
            return companyNames;
        } else {
            LOGGER.info("There isn't any companies");
        }
        return new ArrayList<>();
    }
}
