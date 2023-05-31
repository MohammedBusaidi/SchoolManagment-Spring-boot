package com.SchoolManagment.SchoolManagment.Entity;

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
public class Course extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;

    private String description;

    private String courseCode;

    @ManyToOne
    @JoinColumn(name = "id")
    ClassRoom classRoom;

    @OneToOne
    Teacher teacher;

    @OneToMany
    private Set<StudentCourse> studentCourses;


//    public void assignClassRoom(ClassRoom classRoom) {
//        this.classRoom = classRoom;
//    }
//    public void assignTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }
}
