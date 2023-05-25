package com.SchoolManagment.SchoolManagment.ClassRoom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;

@Service
public class ClassRoomService {
    @Autowired
    ClassRoomRepository classRepository;

    public List<ClassRoom> getAllClasses() {
        return classRepository.findAll();
    }
    public ClassRoom findById(Long classId) {
        return classRepository.findById(classId).get();
    }
    public ClassRoom addClass(ClassRoom cls) {
        return classRepository.save(cls);
    }
    public void deleteClassRoom(Long classId) {
        classRepository.deleteById(classId);
    }
}
