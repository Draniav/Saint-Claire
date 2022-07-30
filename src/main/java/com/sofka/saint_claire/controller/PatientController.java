package com.sofka.saint_claire.controller;


import com.sofka.saint_claire.Entity.Patient;
import com.sofka.saint_claire.service.RecordService;
import com.sofka.saint_claire.utilities.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@Controller
@RestController
@CrossOrigin(value = "*")
public class PatientController {
    @Autowired
    private RecordService recordService;
    private Response response = new Response();
    private HttpStatus httpStatus = HttpStatus.OK;


    @RequestMapping(path = "/home")
    public String home() {
        return "home";
    }


    @GetMapping(path = "api/v1/patient_test")
    public List<Patient> patient() {
        return recordService.getPatientList();
    }


    @GetMapping(path = "/api/v1/patient_show_all")
    public ResponseEntity<Response> getPatientLis() {
        response.data = recordService.getPatientList();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping(path = "/api/v1/patient/{id}")
    public ResponseEntity<Response> getPatientById(@PathVariable(value = "id") Integer id) {
        response.data = recordService.searchPatientByID(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
