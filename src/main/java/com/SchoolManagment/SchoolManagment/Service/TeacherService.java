package com.SchoolManagment.SchoolManagment.Service;

import com.SchoolManagment.SchoolManagment.Entity.Teacher;
import com.SchoolManagment.SchoolManagment.Repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherRepo teacherRepo;

    public List<Teacher> getAllTeachers() {
        return teacherRepo.findAll();
    }

    public Teacher findById(Long teacherId) {
        return teacherRepo.findById(teacherId).get();
    }

    public Teacher addTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }

    public void deleteTeacher(Long teacherId) {
        teacherRepo.deleteById(teacherId);
    }
}
