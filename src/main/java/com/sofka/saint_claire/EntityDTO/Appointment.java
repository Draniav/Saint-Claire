package com.sofka.saint_claire.EntityDTO;

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


}