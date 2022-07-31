package com.sofka.saint_claire.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sofka.saint_claire.utilities.LengthValidator;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToMany;


import java.util.ArrayList;

import java.util.List;


@Data
@Entity
@Table(name = "medical_specialty")
public class MedicalSpecialty {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Medical_Specialty", nullable = false)
    private Integer id;

    @Column(name = "Name_Medical_Specialty", nullable = false, length = 100)
    private String nameMedicalSpecialty;

    @Column(name = "Physician_in_charge_Medical_Specialty", nullable = false, length = 45)
    private String physicianInChargeMedicalSpecialty;

    @OneToMany(mappedBy = "medicalSpecialtyIdMedicalSpecialty")
    @JsonManagedReference

    private List<Patient> patients = new ArrayList<>();

    /**
     * constructs
     */
    public MedicalSpecialty() {
    }

    public MedicalSpecialty(Integer id) {
        this.id = id;
    }

    public MedicalSpecialty(String nameMedicalSpecialty, String physicianInChargeMedicalSpecialty) {
        this.nameMedicalSpecialty = nameMedicalSpecialty;
        this.physicianInChargeMedicalSpecialty = physicianInChargeMedicalSpecialty;
    }

    public MedicalSpecialty(Integer id, String nameMedicalSpecialty, String physicianInChargeMedicalSpecialty) {
        this.id = id;
        this.nameMedicalSpecialty = nameMedicalSpecialty;
        this.physicianInChargeMedicalSpecialty = physicianInChargeMedicalSpecialty;
    }

    /**
     * Validators
     */
    private String validateNameMedicalSpecialty(String name) {
        try {
            if (LengthValidator.validateLength(name, 5, 100)) {
                return name;
            }
        } catch (Exception error) {
            System.err.println("error");
        }
        return null;
    }

    private String validatePhysician(String Physician) {
        try {
            if (LengthValidator.validateLength(Physician, 5, 45)) {
                return Physician;
            }
        } catch (Exception error) {
            System.err.println("error");
        }
        return null;
    }

}