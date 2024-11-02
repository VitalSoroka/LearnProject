package com.application.callboard;

import com.application.callboard.model.Employer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1/employer")
public final class EmployerApi {
    @GetMapping
    public Employer getEmployer(){
        return Employer.builder()
                .name("Super")
                .surname("Worker")
                .age(50)
                .salary(BigDecimal.valueOf(1_000_000.010))
                .build();

    }
}


