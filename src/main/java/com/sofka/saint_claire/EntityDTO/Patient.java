package com.sofka.saint_claire.EntityDTO;

import lombok.Data;
import org.jetbrains.annotations.Nullable;

import javax.persistence.*;
import javax.swing.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "patient")
public class Patient {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Patient", nullable = false)
    private Integer id;

    @Column(name = "Name_Patient", nullable = false, length = 45)
    private String namePatient;

    @Column(name = "Age_Patient", nullable = false)
    private Integer agePatient;

    @Column(name = "Identification_number_Patient", nullable = false)
    private Long identificationNumberPatient;

    @Column(name = "number_of_appointment", nullable = false)
    private Integer numberOfAppointment;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Medical_Specialty_id_Medical_Specialty", nullable = false)
    private MedicalSpecialty medicalSpecialtyIdMedicalSpecialty;

    @OneToMany(mappedBy = "patientIdPatient")
    private Set<Appointment> appointments = new LinkedHashSet<>();


    /**
     * constructs
     */

    public Patient() {
    }


    private @Nullable Integer validateAge(Integer age) {
        try {
            if (age > 0) {
                return age;
            }

        } catch (Exception exception) {
            System.err.println("Error wrong age");
            return null;
        }
        return age;
    }

    public void addAppointment() {
        this.numberOfAppointment++;
    }
}
