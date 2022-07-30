package com.sofka.saint_claire.repositoryDAO;

import com.sofka.saint_claire.EntityDTO.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

    @Query(value = "SELECT id_patient FROM patient " +
            "WHERE Medical_Specialty_id_Medical_Specialty = :idSpeciality " +
            "AND Identification_number_Patient = :identification" ,
            nativeQuery = true)
    Integer validatePatientExist(@Param(value = "idSpeciality") Integer idSpeciality,
                                 @Param(value = "identification") Long identification);
}

