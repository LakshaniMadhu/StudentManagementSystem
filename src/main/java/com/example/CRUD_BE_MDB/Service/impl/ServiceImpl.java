package com.example.CRUD_BE_MDB.Service.impl;

import com.example.CRUD_BE_MDB.Model.Students;
import com.example.CRUD_BE_MDB.Repository.StudentRepository;
import com.example.CRUD_BE_MDB.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Students createStudent(Students student) {
        return studentRepository.save(student);
    }

    @Override
    public Students getStudentById(long id) {
        Optional<Students> student = studentRepository.findById(id);
        return student.orElse(null); // Return null or throw an exception if not found
    }

    @Override
    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Students updateStudent(long id, Students student) {
        if (studentRepository.existsById(id)) {
            student.setId(id);
            return studentRepository.save(student);
        }
        return null; // Return null or throw an exception if not found
    }

    @Override
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }
}
