package com.SchoolManagment.SchoolManagment.Entity;

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
public class Student extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;

    private Integer age;

    private String email;

    private String gender;

    @OneToMany(mappedBy = "enrolledStudents")
    private Set<StudentCourse> studentCourses;


}
