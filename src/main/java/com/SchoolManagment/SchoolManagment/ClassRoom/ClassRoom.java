package com.SchoolManagment.SchoolManagment.ClassRoom;

import com.SchoolManagment.SchoolManagment.Course.Course;
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
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classId;
    private float size;
    private String classCode;
    @JsonIgnore
    @OneToMany(mappedBy = "classRoom")
    private Set<Course> courses = new HashSet<>();

}
