package com.SchoolManagment.SchoolManagment.Controller;

import com.SchoolManagment.SchoolManagment.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("{id}")
    public Student getById(@PathVariable("id") Long studentId) {
        return studentService.findById(studentId);
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") Long studentId) {
        studentService.deleteStudent(studentId);
        return "Student with ID " + studentId + " has been deleted";
    }
}
