package com.SchoolManagment.SchoolManagment.Course;

import com.SchoolManagment.SchoolManagment.ClassRoom.ClassRoom;
import com.SchoolManagment.SchoolManagment.Student.Student;
import com.SchoolManagment.SchoolManagment.StudentCourse.StudentCourse;
import com.SchoolManagment.SchoolManagment.Teacher.Teacher;
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
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseName;
    private String description;
    private String courseCode;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "classRoomId", referencedColumnName = "classId")
    ClassRoom classRoom;
    @OneToOne
    Teacher teacher;
    @OneToMany
    private Set<StudentCourse> studentCourses = new HashSet<>();
}
