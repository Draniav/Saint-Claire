package com.sofka.saint_claire;

import com.sofka.saint_claire.EntityDTO.Patient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SaintClaireApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaintClaireApplication.class, args);}

    @GetMapping(path = "api/v1/hello")
    public List<Patient> hello() {
        return List.of(new Patient(1,
                "alex",
                34,
                1926L,
                null));
    }
}
