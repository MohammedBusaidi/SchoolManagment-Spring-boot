package com.SchoolManagment.SchoolManagment.Service;

import com.SchoolManagment.SchoolManagment.Entity.Student;
import com.SchoolManagment.SchoolManagment.Repository.StudentRepo;
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

    public Student findById(Long studentId) {
        return studentRepo.findById(studentId).get();
    }

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public void deleteStudent(Long studentId) {
        studentRepo.deleteById(studentId);
    }
}
