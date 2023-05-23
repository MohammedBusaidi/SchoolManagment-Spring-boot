package com.SchoolManagment.SchoolManagment.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
