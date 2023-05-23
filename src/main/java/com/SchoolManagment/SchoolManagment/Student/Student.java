package com.SchoolManagment.SchoolManagment.Student;

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
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;
    private int age;
    private String phoneNumber;
    private String nationality;
    private String gender;
    @ManyToOne
    Teacher teacher;
}
