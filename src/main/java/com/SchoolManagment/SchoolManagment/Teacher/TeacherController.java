package com.SchoolManagment.SchoolManagment.Teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @GetMapping("/getAll")
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }
    @GetMapping("{id}")
    public Teacher getById(@PathVariable("id") Long teacherId) {
        return teacherService.findById(teacherId);
    }
    @PostMapping("/addTeacher")
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return teacherService.addTeacher(teacher);
    }
}
