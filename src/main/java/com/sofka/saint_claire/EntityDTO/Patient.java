
package com.sofka.saint_claire.EntityDTO;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToMany;
//import javax.persistence.FetchType;
//import javax.persistence.CascadeType;
import javax.persistence.Id;


import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "patient")
public class Patient implements Serializable {
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

    @OneToMany(mappedBy = "patientIdPatient")
    private Set<Appointment> appointments = new LinkedHashSet<>();

    // @OneToMany(fetch = FetchType.EAGER,
    //     targetEntity =  Appointment.class,
    //     cascade = CascadeType.REMOVE,mappedBy = "patientIdPatient")


    public Patient() {
    }

    public Patient(String namePatient, Integer agePatient, Long identificationNumberPatient) {
        this.namePatient = namePatient;
        this.agePatient = agePatient;
        this.identificationNumberPatient = identificationNumberPatient;
    }

    public Patient(Integer id, String namePatient, Integer agePatient, Long identificationNumberPatient, Set<Appointment> appointments) {
        this.id = id;
        this.namePatient = namePatient;
        this.agePatient = agePatient;
        this.identificationNumberPatient = identificationNumberPatient;
        this.appointments = appointments;
    }


}
