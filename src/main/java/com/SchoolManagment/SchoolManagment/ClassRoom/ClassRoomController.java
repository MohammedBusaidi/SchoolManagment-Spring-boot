package com.SchoolManagment.SchoolManagment.ClassRoom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/class")
public class ClassRoomController {
    @Autowired
    ClassRoomService classService;

    @GetMapping("/getAll")
    public List<ClassRoom> getAllClasses() {
        return classService.getAllClasses();
    }

    @GetMapping("{id}")
    public ClassRoom getById(@PathVariable("id") Long classId) {
        return classService.findById(classId);
    }

    @PostMapping("/addClass")
    public ClassRoom createClass(@RequestBody ClassRoom cls) {
        return classService.addClass(cls);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") Long classId) {
        classService.deleteClassRoom(classId);
        return "ClassRoom with ID" + classId + "has been deleted";
    }
}
