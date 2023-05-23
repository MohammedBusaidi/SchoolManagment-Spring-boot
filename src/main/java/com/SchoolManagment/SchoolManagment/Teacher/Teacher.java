package com.SchoolManagment.SchoolManagment.Teacher;

import com.SchoolManagment.SchoolManagment.Course.Course;
import com.SchoolManagment.SchoolManagment.Student.Student;
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
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teacherId;
    private String teacherName;
    private int age;
    private String phoneNumber;
    private String nationality;
    private String gender;
    @OneToOne(mappedBy = "teacher")
    Course course;
}
