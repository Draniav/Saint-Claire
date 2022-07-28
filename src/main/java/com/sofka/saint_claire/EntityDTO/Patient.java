package com.sofka.saint_claire.EntityDTO;

import lombok.Data;

import javax.persistence.*;
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

    /**
     * Punto de enlace entre la entidad del Contacto y Teléfono (un contacto puede tener muchos números de teléfono)
     */


    @OneToMany(fetch = FetchType.EAGER,
            targetEntity =  Appointment.class,
            cascade = CascadeType.REMOVE,mappedBy = "patientIdPatient")

    
    private Set<Appointment> appointments = new LinkedHashSet<>();


}