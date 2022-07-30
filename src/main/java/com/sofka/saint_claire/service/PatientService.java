package com.sofka.saint_claire.service;

import com.sofka.saint_claire.EntityDTO.Patient;
import com.sofka.saint_claire.repositoryDAO.AppointmentRepository;
import com.sofka.saint_claire.repositoryDAO.PatientRepository;
import com.sofka.saint_claire.service.interfaces.Ipatient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class PatientService implements Ipatient {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;


    @Override
    @Transactional(readOnly = true)
    public List<Patient> getPatientsList() {
        return patientRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Patient createPatient(Patient patient) {
        return null;
    }

    @Override
    public Integer getPatientByID(Integer idSpeciality, Long identification) {
        return patientRepository.validatePatientExist(idSpeciality, identification);
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
