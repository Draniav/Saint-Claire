package com.sofka.saint_claire.controller;



import com.sofka.saint_claire.EntityDTO.Patient;
import com.sofka.saint_claire.service.RecordService;
import com.sofka.saint_claire.utilities.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@Slf4j
@Controller
@RestController
@CrossOrigin(value = "*")
public class RecordController {
    @Autowired
    private RecordService recordService;
    private Response response = new Response();
    private HttpStatus httpStatus = HttpStatus.OK;


    @RequestMapping(path = "/home")
    public String home() {
        return "home";
    }


    @GetMapping(path = "api/v1/patient_show_all")
    public List<Patient> patient() {
        return recordService.getPatientList();
    }
    @GetMapping(path = "api/v1/speciality")
    public List<String> speciality() {

        return List.of("name test",  "mphysician-test");
    }

    @GetMapping(path = "/api/v1/boards")
    public ResponseEntity<Response> index() {
        response.data = recordService.getPatientList();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
