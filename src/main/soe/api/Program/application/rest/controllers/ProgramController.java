package main.soe.api.Program.application.rest.controllers;

import java.util.List;

import main.soe.api.Program.domain.entities.ProgramEntity;
import main.soe.api.Program.domain.services.ProgramService;

//@RequestMapping("/program")
public class ProgramController {

    // @Autowired
    private ProgramService programService;

    // @GetMapping
    public List<ProgramEntity> allPrograms() {
        return programService.allPrograms();
    }

    // @PostMapping
    public ProgramEntity add() {
        return programService.add();
    }

    // @PutMapping
    public ProgramEntity edit(ProgramEntity program) {
        return programService.edit(program);
    }
}
