package main.soe.api.PaymentPlan.application.rest.controllers;

import main.soe.api.PaymentPlan.domain.entities.PaymentEntity;
import main.soe.api.PaymentPlan.domain.services.PaymentPlanService;
import main.soe.api.Student.domain.entities.StudentEntity;

//@RequestMapping("/payment")
public class PaymentPlanController {

    // @Autowired
    private PaymentPlanService paymentPlanService;

    // @GetMapping
    public StudentEntity studentAccount(StudentEntity student) {
        return paymentPlanService.studentAccount(student);
    }

    // @GetMapping
    public PaymentEntity paymentPlan(StudentEntity student) {
        return paymentPlanService.paymentPlan(student);
    }
}
