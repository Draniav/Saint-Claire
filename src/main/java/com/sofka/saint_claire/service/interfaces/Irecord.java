package com.sofka.saint_claire.service.interfaces;

import com.sofka.saint_claire.EntityDTO.Patient;

import java.util.List;


public interface Irecord {

    /**
     * CRUD Patient
     * */
    List<Patient> getPatientList();
    List<Patient> searchPatientByID(Integer id);
    Patient createPatient(Patient patient);
    Patient updatePatient(Integer id, Patient patient);
    Patient updatePatientName(Integer id, Patient patient);
    Patient updatePatientAge(Integer id, Patient patient);
    Patient deletePatient(Integer id);






}

