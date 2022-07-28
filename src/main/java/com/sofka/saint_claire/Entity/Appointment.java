package com.sofka.saint_claire.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "appointment")
public class Appointment {
    @Id
    @Column(name = "id_Appointment", nullable = false)
    private Integer id;

    @Column(name = "date_Appointment", nullable = false)
    private LocalDate dateAppointment;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Patient_id_Patient", nullable = false)
    private Patient patientIdPatient;

    @OneToMany(mappedBy = "appointmentIdAppointment")
    private Set<MedicalSpecialty> medicalSpecialties = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDateAppointment() {
        return dateAppointment;
    }

    public void setDateAppointment(LocalDate dateAppointment) {
        this.dateAppointment = dateAppointment;
    }

    public Patient getPatientIdPatient() {
        return patientIdPatient;
    }

    public void setPatientIdPatient(Patient patientIdPatient) {
        this.patientIdPatient = patientIdPatient;
    }

    public Set<MedicalSpecialty> getMedicalSpecialties() {
        return medicalSpecialties;
    }

    public void setMedicalSpecialties(Set<MedicalSpecialty> medicalSpecialties) {
        this.medicalSpecialties = medicalSpecialties;
    }

}