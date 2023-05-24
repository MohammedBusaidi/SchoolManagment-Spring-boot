package com.SchoolManagment.SchoolManagment.Course;

import com.SchoolManagment.SchoolManagment.Class.ClassRoom;
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
    @ManyToOne
    ClassRoom classRoom;
    @OneToOne
    Teacher teacher;
    @ManyToMany
    @JoinTable(name = "student_enrolled",
            joinColumns = @JoinColumn(name = "subjectId"),
            inverseJoinColumns = @JoinColumn(name = "studentId")
    )
    private Set<Student> enrolledStudents = new HashSet<>();

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }
    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void assignClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }
}
