package com.SchoolManagment.SchoolManagment.Teacher;

import com.SchoolManagment.SchoolManagment.BaseEntity.BaseEntity;
import com.SchoolManagment.SchoolManagment.ClassRoom.ClassRoom;
import com.SchoolManagment.SchoolManagment.Course.Course;
import com.SchoolManagment.SchoolManagment.StudentCourse.StudentCourse;
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
    private Long teacherId;
    private String teacherName;
    private int age;
    private String phoneNumber;
    private String specialization;
    @OneToOne(mappedBy = "teacher")
    Course course;
    @OneToMany(mappedBy = "teacher")
    private Set<ClassRoom> classRooms = new HashSet<>();

}
