package main.soe.api.Group.application.rest.controllers;

import main.soe.api.Group.domain.entities.GroupEntity;
import main.soe.api.Group.domain.services.GroupService;
import main.soe.api.Program.domain.entities.ProgramEntity;
import main.soe.api.Teacher.domain.entities.TeacherEntity;

import java.util.List;

//@RequestMapping("/group")
public class GroupController {
    // @Autowired
    private GroupService groupService;

    // @GetMapping
    public List<GroupEntity> allGroups() {
        return groupService.allGroups();
    }

    // @PostMapping
    public GroupEntity addByProgram(ProgramEntity program) {
        return groupService.addByProgram(program);
    }

    // @PutMapping
    public GroupEntity edit(GroupEntity group) {
        return groupService.edit(group);
    }

    // @PostMapping
    public GroupEntity addTeacherIntoGroup(TeacherEntity teacher) {
        return groupService.addTeacherIntoGroup(teacher);
    }
}
