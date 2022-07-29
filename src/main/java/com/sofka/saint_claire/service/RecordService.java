package com.sofka.saint_claire.service;

import com.sofka.saint_claire.EntityDTO.Patient;
import com.sofka.saint_claire.repositoryDAO.AppointmentRepository;
import com.sofka.saint_claire.repositoryDAO.MedicalSpecialtyRepository;
import com.sofka.saint_claire.repositoryDAO.PatientRepository;
import com.sofka.saint_claire.service.interfaces.Irecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RecordService implements Irecord {
    @Autowired
    private AppointmentRepository appointmentRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private MedicalSpecialtyRepository medicalSpecialtyRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Patient> getList() {
        List<Patient> listis =  patientRepository.findAll();
        List<Patient> listi = List.of(new Patient(1,
                        "alex",
                        34,
                        1926L, null));

                System.out.println("Hola desde getList");

        return listis;
    }
    @Transactional(readOnly = true)
    @Override
    public List<Patient> searchPatient(String dataToSearch) {
        return null;
    }

    @Override
    public Patient createPatient(Patient patient) {
        return null;
    }

    @Override
    public Patient updatePatient(Integer id, Patient patient) {
        return null;
    }

    @Override
    public Patient updatePatientName(Integer id, Patient patient) {
        return null;
    }

    @Override
    public Patient updatePatientAge(Integer id, Patient patient) {
        return null;
    }

    @Override
    public Patient deletePatient(Integer id) {
        return null;
    }
}
