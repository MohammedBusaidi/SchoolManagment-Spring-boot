package com.SchoolManagment.SchoolManagment.Course;

import com.SchoolManagment.SchoolManagment.Student.Student;
import com.SchoolManagment.SchoolManagment.Student.StudentService;
import com.SchoolManagment.SchoolManagment.StudentCourse.StudentCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/course")
public class CourseController {
    @Autowired
    CourseService courseService;
    @Autowired
    StudentService studentService;
    @GetMapping("/getAll")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
    @GetMapping("{id}")
    public Course getById(@PathVariable("id") Long courseId) {
        return courseService.findById(courseId);
    }
    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }
//    @PutMapping("/{courseId}/student/{studentId}")
//    Course enrollStudentToCourse(@PathVariable Long courseId, @PathVariable Long studentId) {
//        Course course = courseService.getOne(courseId);
////        StudentCourse student =
////        course.enrollStudent(student);
//    }
}
