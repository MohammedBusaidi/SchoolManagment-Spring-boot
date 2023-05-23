package com.SchoolManagment.SchoolManagment.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
}
