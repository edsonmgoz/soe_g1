package main.soe.api.Student.domain.services;

import main.soe.api.Group.domain.entities.GroupEntity;
import main.soe.api.Student.domain.entities.StudentEntity;
import main.soe.api.common.helpers.EmailHelper;

import java.util.List;

public class StudentService {

    public StudentEntity profile(StudentEntity student) {
        return null;
    }

    public StudentEntity addByGroup(GroupEntity group) {
        return null;
    }

    public void disqualifyByGroup(GroupEntity group) {

    }

    public List<StudentEntity> listStudentsByGroup(GroupEntity group) {
        return null;
    }

    public void sendEmail(StudentEntity student, EmailHelper emailHelper) {

    }
}
