package com.sofka.saint_claire.controller;


import com.sofka.saint_claire.Entity.MedicalSpecialty;
import com.sofka.saint_claire.EntityDTOs.MedicalSpecialtyDTO;
import com.sofka.saint_claire.service.MedicalSpecialtyService;
import com.sofka.saint_claire.utilities.Response;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@CrossOrigin(value = "*")
@RequestMapping("api/v1/specialty")
public class SpecialtyController {

    @Autowired
    private MedicalSpecialtyService medicalSpecialtyService;
    private Response response = new Response();
    private HttpStatus httpStatus = HttpStatus.OK;

    @GetMapping(path = "/list")
    public ResponseEntity<Response> showSpecialtyList() {
        response.data = medicalSpecialtyService.getSpecialityList();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Response> createSpeciality(@RequestBody MedicalSpecialtyDTO medicalSpecialityDTO) {
        response.restart();
        try {
            response.data = medicalSpecialtyService.createSpeciality(null);
            httpStatus = HttpStatus.CREATED;
        } catch (ConstraintViolationException exception) {
            response.data = exception.getCause();
            response.message = exception.getMessage();
            response.error = true;
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity(response, httpStatus);
    }


    @DeleteMapping(path = "delete/{id}")
    public ResponseEntity<Response> delete(@PathVariable(value = "id") Integer id) {
        response.data = medicalSpecialtyService.deleteSpeciality(id);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}