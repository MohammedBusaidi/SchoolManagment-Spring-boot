package com.SchoolManagment.SchoolManagment.Entity;

import com.SchoolManagment.SchoolManagment.Entity.BaseEntity;
import com.SchoolManagment.SchoolManagment.Entity.ClassRoom;
import com.SchoolManagment.SchoolManagment.Entity.Course;
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
public class Teacher extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String teacherName;

    private Integer age;

    private String phoneNumber;

    private String specialization;

    @OneToOne(mappedBy = "teacher")
    Course course;

    @OneToMany(mappedBy = "teacher")
    private Set<ClassRoom> classRooms;

}
