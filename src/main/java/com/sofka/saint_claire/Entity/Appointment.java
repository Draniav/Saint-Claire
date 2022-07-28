package com.sofka.saint_claire.Entity;

import javax.persistence.*;

@Entity
@Table(name = "appointment")
public class Appointment {
    @EmbeddedId
    private AppointmentId id;

    @MapsId("medicalSpecialtyIdMedicalSpecialty")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Medical_Specialty_id_Medical_Specialty", nullable = false)
    private MedicalSpecialty medicalSpecialtyIdMedicalSpecialty;

    @MapsId("patientIdPatient")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Patient_id_Patient", nullable = false)
    private Patient patientIdPatient;

    @Column(name = "date_Appointment", nullable = false, length = 45)
    private String dateAppointment;


}