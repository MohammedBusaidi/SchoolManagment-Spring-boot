package com.SchoolManagment.SchoolManagment.Class;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;

@Service
public class ClassService {
    @Autowired
    ClassRepository classRepository;

    public List<Class> getAllClasses() {
        return classRepository.findAll();
    }
    public Class findById(Long classId) {
        return classRepository.findById(classId).get();
    }
    public Class addeClass(Class cls) {
        return classRepository.save(cls);
    }
}
