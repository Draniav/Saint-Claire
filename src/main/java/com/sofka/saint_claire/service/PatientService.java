package com.sofka.saint_claire.service;

import com.sofka.saint_claire.Entity.Appointment;
import com.sofka.saint_claire.Entity.Patient;
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
    @Transactional
    public Patient createPatient(Patient patient) {
        patient.setNumberOfAppointment(0);
        Patient newPatient = patientRepository.save(patient);
        addNewAppointment(newPatient.getId());
        return newPatient;

    }
    @Override
    @Transactional
    public Integer addNewAppointment(Integer idPatient) {
        var PatientToVerify  = patientRepository.findById(idPatient);
        if (PatientToVerify.isEmpty()) {
            return null;
        }

        Patient patient = PatientToVerify.get();
        patient.addAppointment();
        Appointment appointment = new Appointment( null,null);
        appointmentRepository.save(appointment);
        return appointment.getId();

    }
    @Override
    @Transactional(readOnly = true)
    public Integer getPatientByID(Integer idSpeciality, Long identification) {
        return patientRepository.validatePatientExist(idSpeciality, identification);
    }



    @Override
    public Patient deletePatient(Integer idPatient) {
        var patient = patientRepository.findById(idPatient);
        if (patient.isPresent()) {
            patientRepository.delete(patient.get());
            return patient.get();
        }
        return null;
    }
}
