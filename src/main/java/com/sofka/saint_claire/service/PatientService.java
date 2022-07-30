package com.sofka.saint_claire.service;

import com.sofka.saint_claire.EntityDTO.Patient;
import com.sofka.saint_claire.service.interfaces.Ipatient;

import java.util.List;

public class PatientService implements Ipatient {
    @Override
    public List<Patient> getPatientsList() {
        return null;
    }

    @Override
    public Patient createPatient(Patient patient) {
        return null;
    }

    @Override
    public Integer getPatientByID(Integer idSpeciality, Long identification) {
        return null;
    }

    @Override
    public Integer addNewAppointment(Integer idPatient) {
        return null;
    }

    @Override
    public Patient deletePatient(Integer idPatient) {
        return null;
    }
}
