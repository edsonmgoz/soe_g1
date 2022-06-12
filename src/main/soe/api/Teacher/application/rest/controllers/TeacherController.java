package main.soe.api.Teacher.application.rest.controllers;

import main.soe.api.Teacher.domain.entities.TeacherEntity;
import main.soe.api.Teacher.domain.services.TeacherService;

import java.util.List;

//@RequestMapping("/teacher")
public class TeacherController {
    // @Autowired
    private TeacherService teacherService;

    // @GetMapping
    public List<TeacherEntity> allTeachers() {
        return teacherService.allTeachers();
    }

    // @PostMapping
    public TeacherEntity add() {
        return teacherService.add();
    }

    // @PutMapping
    public TeacherEntity edit(TeacherEntity teacher) {
        return teacherService.edit(teacher);
    }
}
