package com.sofka.saint_claire.repositoryDAO;

import com.sofka.saint_claire.Entity.MedicalSpecialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalSpecialtyRepository extends JpaRepository<MedicalSpecialty, Integer> {
}