package com.SchoolManagment.SchoolManagment.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/course")
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping("/getAll")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
    @GetMapping("{id}")
    public Course getById(@PathVariable Long courseId) {
        return courseService.findById(courseId);
    }
}
