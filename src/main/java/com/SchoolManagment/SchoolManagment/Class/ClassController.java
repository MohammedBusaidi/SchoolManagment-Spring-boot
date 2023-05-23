package com.SchoolManagment.SchoolManagment.Class;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/class")
public class ClassController {
    @Autowired
    ClassService classService;

    public List<Class> getAllClasses() {
        return classService.getAllClasses();
    }
}
