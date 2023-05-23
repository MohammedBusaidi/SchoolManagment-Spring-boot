package com.SchoolManagment.SchoolManagment.Class;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Class getById(@PathVariable("id") long classId) {
        return classService.findById(classId);
    }
    @PostMapping("/addClass")
    public Class createClass(@RequestBody Class cls) {
        return classService.addeClass(cls);
    }
}
