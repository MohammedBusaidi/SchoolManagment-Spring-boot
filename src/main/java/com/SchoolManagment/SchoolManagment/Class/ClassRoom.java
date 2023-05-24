package com.SchoolManagment.SchoolManagment.Class;

import com.SchoolManagment.SchoolManagment.Course.Course;
import com.SchoolManagment.SchoolManagment.StudentCourse.StudentCourse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classId;
    private float width;
    private float height;
    private String classCode;
    @OneToMany(mappedBy = "classRoom")
    private Set<Course> courses = new HashSet<>();

}
