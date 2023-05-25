package com.SchoolManagment.SchoolManagment.StudentCourse;

import com.SchoolManagment.SchoolManagment.Course.Course;
import com.SchoolManagment.SchoolManagment.Student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@Service
public class StudentCourseService {
    @Autowired
    StudentCourseRepository studentCourseRepository;

    public StudentCourse findById(Long studentId) {
        return studentCourseRepository.findById(studentId).get();
    }
}
