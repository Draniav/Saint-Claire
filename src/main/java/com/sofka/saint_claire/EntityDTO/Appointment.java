package com.sofka.saint_claire.EntityDTO;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "appointment")
public class Appointment {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Appointment", nullable = false)
    private Integer id;

    @Column(name = "date_Appointment", nullable = false)
    private LocalDate dateAppointment;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Patient_id_Patient", nullable = false)
    private Patient patientIdPatient;

    @OneToMany(mappedBy = "appointmentIdAppointment")
    private Set<MedicalSpecialty> medicalSpecialties = new LinkedHashSet<>();


}