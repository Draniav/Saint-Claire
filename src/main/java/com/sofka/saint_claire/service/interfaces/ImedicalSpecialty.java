package com.sofka.saint_claire.service.interfaces;

import com.sofka.saint_claire.Entity.MedicalSpecialty;

import java.util.List;

public interface ImedicalSpecialty {
    List<MedicalSpecialty> getSpecialityList();

    MedicalSpecialty getSpecialityByID(Integer id);

    MedicalSpecialty createSpeciality(MedicalSpecialty speciality);

    MedicalSpecialty updateSpeciality(Integer idSpeciality, MedicalSpecialty speciality);

    MedicalSpecialty deleteSpeciality(Integer idSpeciality) throws IllegalAccessException;
}
