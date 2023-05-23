package com.SchoolManagment.SchoolManagment.Class;

import com.SchoolManagment.SchoolManagment.Course.Course;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classId;
    private float width;
    private float height;
    private String classCode;
    @OneToMany
    List<Course> courses;
}
