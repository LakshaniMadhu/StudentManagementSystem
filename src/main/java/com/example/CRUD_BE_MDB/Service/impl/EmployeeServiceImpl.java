package com.example.CRUD_BE_MDB.Service.impl;

import com.example.CRUD_BE_MDB.Model.Students;
import com.example.CRUD_BE_MDB.Repository.EmployeeRepository;
import com.example.CRUD_BE_MDB.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Students createEmployee(Students employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Students getEmployeeById(long id) {
        Optional<Students> employee = employeeRepository.findById(id);
        return employee.orElse(null); // Return null or throw an exception if not found
    }

    @Override
    public List<Students> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Students updateEmployee(long id, Students employee) {
        if (employeeRepository.existsById(id)) {
            employee.setId(id);
            return employeeRepository.save(employee);
        }
        return null; // Return null or throw an exception if not found
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }
}
