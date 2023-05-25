package com.SchoolManagment.SchoolManagment.Student;

import com.SchoolManagment.SchoolManagment.StudentCourse.StudentCourse;
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
    private String email;
    private String gender;
    @JsonIgnore
    @OneToMany(mappedBy = "enrolledStudents")
    private Set<StudentCourse> studentCourses = new HashSet<>();


}
