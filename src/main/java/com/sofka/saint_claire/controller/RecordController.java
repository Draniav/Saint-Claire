package com.sofka.saint_claire.controller;


import com.sofka.saint_claire.EntityDTO.Patient;
import com.sofka.saint_claire.service.RecordService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Slf4j
@RestController
public class RecordController {
    @Autowired
    private RecordService recordService;
    private Response response = new Response();
    private HttpStatus httpStatus = HttpStatus.OK;


    @GetMapping(path = "/")
    public List<Patient>  homeIndex1() {
        System.out.println("Hola mundo");
        hello();

        return hello();
    }


    @GetMapping(path = "api/v1/hello")
    public List<Patient> hello() {
        System.out.println("Hola mundo desde hello ");
        return List.of(new Patient(1,
                "alex",
                34,
                1926L,
                null));
    }

    @GetMapping(path = "api/v1/hello1")
    public List<Patient> hello1() {
        return List.of(new Patient(1,
                "marta",
                34,
                345L,
                null));
    }


}
