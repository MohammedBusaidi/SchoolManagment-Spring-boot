package com.SchoolManagment.SchoolManagment.Entity;

import com.SchoolManagment.SchoolManagment.Entity.BaseEntity;
import com.SchoolManagment.SchoolManagment.Entity.Course;
import com.SchoolManagment.SchoolManagment.Entity.Student;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentCourse extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Float grade;

    @ManyToOne
    private Course enrolledCourses;

    @ManyToOne
    private Student enrolledStudents;

}
