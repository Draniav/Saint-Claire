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
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Slf4j
@Controller
@RestController
@CrossOrigin(value = "*")
public class SpecialityController {
    @Autowired
    private RecordService recordService;
    private Response response = new Response();
    private HttpStatus httpStatus = HttpStatus.OK;

    @GetMapping(path = "api/v1/speciality")
    public List<String> speciality() {

        return List.of("name test",  "mphysician-test");
    }

    @GetMapping(path = "/api/v1/speciality_show_all")
    public ResponseEntity<Response> showSpecialityList() {
       // response.data = recordService.getPatientList();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping(path = "/api/v1/speciality/{id}")
    public ResponseEntity<Response> getSpecialityById(@PathVariable(value = "id") Integer id) {
       // response.data = recordService.searchPatientByID(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
