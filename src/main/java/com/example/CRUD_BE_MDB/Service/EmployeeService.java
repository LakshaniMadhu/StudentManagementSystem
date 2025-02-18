package com.example.CRUD_BE_MDB.Service;

import com.example.CRUD_BE_MDB.Model.Students;

import java.util.List;

public interface EmployeeService {
    Students createEmployee(Students employee);
    Students getEmployeeById(long id);
    List<Students> getAllEmployees();
    Students updateEmployee(long id, Students employee);
    void deleteEmployee(long id);
}
