package com.SchoolManagment.SchoolManagment.Class;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/class")
public class ClassController {
    @Autowired
    ClassService classService;

    @GetMapping("/getAll")
    public List<Class> getAllClasses() {
        return classService.getAllClasses();
    }
    @GetMapping("{id}")
    public Class getById(@PathVariable long classId) {
        return classService.findById(classId);
    }
}
