package com.SchoolManagment.SchoolManagment.Service;

import com.SchoolManagment.SchoolManagment.Entity.StudentCourse;
import com.SchoolManagment.SchoolManagment.Repository.StudentCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentCourseService {
    @Autowired
    StudentCourseRepository studentCourseRepository;

    public StudentCourse findById(Long studentId) {
        return studentCourseRepository.findById(studentId).get();
    }

    public StudentCourse saveCourse(StudentCourse studentCourse) {
        return studentCourseRepository.save(studentCourse);
    }
}
