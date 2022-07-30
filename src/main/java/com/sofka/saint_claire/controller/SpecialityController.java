package com.sofka.saint_claire.controller;


import com.sofka.saint_claire.Entity.MedicalSpecialty;
import com.sofka.saint_claire.service.MedicalSpecialtyService;
import com.sofka.saint_claire.utilities.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@Slf4j
@RestController
@CrossOrigin(value = "*")
@RequestMapping("api/v1/specialty")
public class SpecialityController {

    @Autowired
    private MedicalSpecialtyService medicalSpecialtyService;
    private Response response = new Response();
    private HttpStatus httpStatus = HttpStatus.OK;

    @GetMapping(path = "/list")
    public ResponseEntity<Response> showSpecialityList() {
        response.data = medicalSpecialtyService.getSpecialityList();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }



}
