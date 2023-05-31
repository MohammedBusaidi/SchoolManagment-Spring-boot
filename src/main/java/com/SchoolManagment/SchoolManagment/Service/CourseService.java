package com.SchoolManagment.SchoolManagment.Service;

import com.SchoolManagment.SchoolManagment.Repository.CourseRepository;
import com.SchoolManagment.SchoolManagment.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course findById(Long courseId) {
        return courseRepository.findById(courseId).get();
    }

    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    public void deleteCourse(Long courseId) {
        courseRepository.deleteById(courseId);
    }

}
