package main.soe.api.Student.application.rest.controllers;

import main.soe.api.Group.domain.entities.GroupEntity;
import main.soe.api.Student.domain.entities.StudentEntity;
import main.soe.api.Student.domain.services.StudentService;
import main.soe.api.common.helpers.EmailHelper;

import java.util.List;

//@RequestMapping("/student")
public class StudentController {

    // @Autowired
    private StudentService studentService;
    private EmailHelper emailHelper;

    // @GetMapping
    public StudentEntity profile(StudentEntity student) {
        return studentService.profile(student);
    }

    // @PostMapping
    public StudentEntity addByGroup(GroupEntity group) {
        return studentService.addByGroup(group);
    }

    // @PostMapping
    public void disqualifyByGroup(GroupEntity group) {
        studentService.disqualifyByGroup(group);
    }

    // @GetMapping
    public List<StudentEntity> listStudentsByGroup(GroupEntity group) {
        return studentService.listStudentsByGroup(group);
    }

    // @PostMapping
    public void sendEmail(StudentEntity student, EmailHelper emailHelper) {
        studentService.sendEmail(student, emailHelper);
    }

}
