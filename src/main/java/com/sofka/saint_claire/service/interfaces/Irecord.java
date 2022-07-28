package com.sofka.saint_claire.service.interfaces;

import com.sofka.saint_claire.EntityDTO.Patient;

import java.util.List;


public interface Irecord {


    List<Patient> getList();


    List<Patient> searchPatient(String dataToSearch);


    Patient createPatient(Patient patient);


    Patient updatePatient(Integer id, Patient patient);


    Patient updatePatientName(Integer id, Patient patient);


    Patient updatePatientAge(Integer id, Patient patient);


    Patient deletePatient(Integer id);






}

