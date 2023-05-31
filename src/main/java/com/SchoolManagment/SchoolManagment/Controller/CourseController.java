package com.SchoolManagment.SchoolManagment.Controller;

import com.SchoolManagment.SchoolManagment.Entity.Course;
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
    ClassRoomService classService;
    @Autowired
    StudentCourseService studentCourseService;

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

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") Long courseId) {
        courseService.deleteCourse(courseId);
        return "Course with ID " + courseId + " has been deleted";
    }

    //Assign classRoom to course
//    @PutMapping("/{courseId}/classRoom/{classRoomId}")
//    Course assignClassRoomToCourse(@PathVariable Long courseId, @PathVariable Long classRoomId) {
//        Course course = courseService.findById(courseId);
//        ClassRoom classRoom = classService.findById(classRoomId);
//        course.assignClassRoom(classRoom);
//        return courseService.saveCourse(course);
//    }

    //Assign teacher to course
//    @PutMapping("/{courseId}/teacher/{teacherId}")
//    Course assignTeacherToCourse(@PathVariable Long courseId, @PathVariable Long teacherId) {
//        Course course = courseService.findById(courseId);
//        Teacher teacher = teacherService.findById(teacherId);
//        course.assignTeacher(teacher);
//        return courseService.saveCourse(course);
//    }

    //Enroll student to course
//    @PutMapping("/{courseId}/student/{studentId}")
//    Course enrollStudentToCourse(@PathVariable Long courseId, @PathVariable Long studentId) {
//        Course course = studentCourseService.findById(courseId);
//        StudentCourse studentCourse = studentCourseService.findById(studentId);
//        course.enrollStudent(studentCourse);
//        return studentCourseService.saveCourse(studentCourse);
//    }

}
