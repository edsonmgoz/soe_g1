package main.soe.api.Report.application.rest.controllers;

import java.util.List;

import main.soe.api.Report.domain.services.ReportService;

//@RequestMapping("/report")
public class ReportController {

    // @Autowired
    private ReportService reportService;

    // @GetMapping
    public List<Object> studentsByProgramAndGroup() {
        return reportService.studentsByProgramAndGroup();
    }

    // @GetMapping
    public List<Object> paymentsByProgramAndGroup() {
        return reportService.paymentsByProgramAndGroup();
    }

    // @GetMapping
    public List<Object> studentsByProgram() {
        return reportService.studentsByProgram();
    }

    // @GetMapping
    public List<Object> studentsByTeacher() {
        return reportService.studentsByTeacher();
    }
}
