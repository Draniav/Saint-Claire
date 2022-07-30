package com.sofka.saint_claire.service;

import com.sofka.saint_claire.EntityDTO.MedicalSpecialty;
import com.sofka.saint_claire.repositoryDAO.MedicalSpecialtyRepository;
import com.sofka.saint_claire.service.interfaces.ImedicalSpecialty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MedicalSepcialtyService implements ImedicalSpecialty {

    @Autowired
    private MedicalSpecialtyRepository medicalSpecialtyRepository;

    @Override
    @Transactional(readOnly = true)
    public List<MedicalSpecialty> getSpecialityList() {
        return medicalSpecialtyRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public MedicalSpecialty getSpecialityByID(Integer id) {
        var specialty = medicalSpecialtyRepository.findById(id);
        return specialty.isPresent() ? specialty.get() : null;
    }

    @Override
    @Transactional
    public MedicalSpecialty createSpeciality(MedicalSpecialty speciality) {
        return medicalSpecialtyRepository.save(speciality);
    }

    @Override
    @Transactional
    public MedicalSpecialty updateSpeciality(Integer idSpeciality, MedicalSpecialty specialty) {
        specialty.setId(idSpeciality);
        return medicalSpecialtyRepository.save(specialty);
    }

    @Override
    public MedicalSpecialty deleteSpeciality(Integer idSpeciality) {
        var speciality = medicalSpecialtyRepository.findById(idSpeciality);
        if (speciality.isPresent()) {
            medicalSpecialtyRepository.delete(speciality.get());
            return speciality.get();
        }
        return null;
    }
}
