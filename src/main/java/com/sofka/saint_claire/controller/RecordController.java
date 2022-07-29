package com.sofka.saint_claire.controller;


import com.sofka.saint_claire.EntityDTO.MedicalSpecialty;
import com.sofka.saint_claire.EntityDTO.Patient;
import com.sofka.saint_claire.service.RecordService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@Slf4j
@Controller
@RestController
public class RecordController {
    @Autowired
    private RecordService recordService;
    private Response response = new Response();
    private HttpStatus httpStatus = HttpStatus.OK;


    @RequestMapping(path = "/home")
    public String home() {
        return "home";
    }


    @GetMapping(path = "api/v1/patient")
    public List<Patient> patient() {
        List<Patient> lista = recordService.getList();

        return lista;
    }
    @GetMapping(path = "api/v1/speciality")
    public List<String> speciality() {

        return List.of("name test",  "mphysician-test");
    }

}
