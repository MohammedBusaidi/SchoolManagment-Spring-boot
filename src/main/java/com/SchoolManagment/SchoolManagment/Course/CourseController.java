package com.SchoolManagment.SchoolManagment.Course;

import com.SchoolManagment.SchoolManagment.Class.ClassRoom;
import com.SchoolManagment.SchoolManagment.Class.ClassService;
import com.SchoolManagment.SchoolManagment.Student.Student;
import com.SchoolManagment.SchoolManagment.Student.StudentService;
import com.SchoolManagment.SchoolManagment.Teacher.Teacher;
import com.SchoolManagment.SchoolManagment.Teacher.TeacherService;
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
    @Autowired
    TeacherService teacherService;
    @Autowired
    ClassService classService;
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
    @PutMapping("/{courseId}/student/{studentId}")
    Course enrollStudentToCourse(@PathVariable Long courseId, @PathVariable Long studentId) {
        Course course = courseService.findById(courseId);
        Student student = studentService.findById(studentId);
        course.enrollStudent(student);
        return courseService.saveCourse(course);
    }
    @PutMapping("/{courseId}/teacher/{teacherId}")
    Course assignTeacherToCourse(@PathVariable Long courseId, @PathVariable Long teacherId) {
        Course course = courseService.findById(courseId);
        Teacher teacher = teacherService.findById(teacherId);
        course.assignTeacher(teacher);
        return courseService.saveCourse(course);
    }
    @PutMapping("/{courseId}/classRoom/{classRoomId}")
    Course assignClassRoomToCourse(@PathVariable Long courseId, @PathVariable Long classRoomId) {
        Course course = courseService.findById(courseId);
        ClassRoom classRoom = classService.findById(classRoomId);
        course.assignClassRoom(classRoom);
        return courseService.saveCourse(course);
    }
}
