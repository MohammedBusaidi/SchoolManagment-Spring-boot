package com.SchoolManagment.SchoolManagment.Student;

import com.SchoolManagment.SchoolManagment.Course.Course;
import com.SchoolManagment.SchoolManagment.StudentCourse.StudentCourse;
import com.SchoolManagment.SchoolManagment.Teacher.Teacher;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;
    private int age;
    private String phoneNumber;
    private String nationality;
    private String gender;
    @JsonIgnore
    @ManyToMany(mappedBy = "enrolledStudents")
    private Set<Course> courses = new HashSet<>();
}
