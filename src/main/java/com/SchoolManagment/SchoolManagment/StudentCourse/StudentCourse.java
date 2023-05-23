package com.SchoolManagment.SchoolManagment.StudentCourse;

import com.SchoolManagment.SchoolManagment.Course.Course;
import com.SchoolManagment.SchoolManagment.Student.Student;
import com.SchoolManagment.SchoolManagment.Teacher.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long studentCourseId;
    int grade;
    @ManyToOne
    Course course;
    @ManyToOne
    Student student;

}
