package com.sofka.saint_claire.repositoryDAO;

import com.sofka.saint_claire.EntityDTO.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}