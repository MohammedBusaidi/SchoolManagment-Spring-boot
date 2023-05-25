package com.SchoolManagment.SchoolManagment.StudentCourse;

import com.SchoolManagment.SchoolManagment.Course.Course;
import com.SchoolManagment.SchoolManagment.Student.Student;
import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
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
    float grade;
    @ManyToOne
    Course enrolledCourses;
    @ManyToOne
    Student enrolledStudents;

}
