package com.sofka.saint_claire.EntityDTO;

import javax.persistence.*;

@Entity
@Table(name = "medical_specialty")
public class MedicalSpecialty {
    @Id
    @Column(name = "id_Medical_Specialty", nullable = false)
    private Integer id;

    @Column(name = "Name_Medical_Specialty", nullable = false, length = 100)
    private String nameMedicalSpecialty;

    @Column(name = "Physician_in_charge_Medical_Specialty", nullable = false, length = 45)
    private String physicianInChargeMedicalSpecialty;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "medicalSpecialtyIdMedicalSpecialty")
    private Appointment appointments;


}