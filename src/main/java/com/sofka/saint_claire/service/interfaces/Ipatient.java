package com.sofka.saint_claire.service.interfaces;

import com.sofka.saint_claire.Entity.Patient;

import java.util.List;

public interface Ipatient {

    List<Patient> getPatientsList();

    Patient createPatient(Patient patient);

    Integer getPatientByID(Integer idSpeciality, Long identification);

    Integer addNewAppointment(Integer idPatient);

    Patient deletePatient(Integer idPatient);


}
