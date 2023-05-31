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
public class ClassRoom extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Float area;

    private String classCode;

    @OneToMany(mappedBy = "classRoom")
    private Set<Course> courses;

    @ManyToOne
    private Teacher teacher;

}
