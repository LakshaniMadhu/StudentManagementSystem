package com.example.CRUD_BE_MDB.Service;

import com.example.CRUD_BE_MDB.Model.Students;

import java.util.List;

public interface StudentService {
    Students createStudent(Students employee);
    Students getStudentById(long id);
    List<Students> getAllStudents();
    Students updateStudent(long id, Students student);
    void deleteStudent(long id);
}
