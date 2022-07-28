
package com.sofka.saint_claire.EntityDTO;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.time.LocalDate;


@Entity
@Data
@Table(name = "appointment")
public class Appointment {
    private static final long serialVersionUID = 1L;


    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Id
    @Column(name = "id_Appointment", nullable = false)
    private Integer id;

    @Column(name = "date_Appointment", nullable = false)
    private LocalDate dateAppointment;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Patient_id_Patient", nullable = false)
    private Patient patientIdPatient;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Medical_Specialty_id_Medical_Specialty", nullable = false)
    private MedicalSpecialty medicalSpecialtyIdMedicalSpecialty;



}