package com.sofka.saint_claire.EntityDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @Column(name = "id_Patient", nullable = false)
    private Integer id;

    @Column(name = "Name_Patient", nullable = false, length = 45)
    private String namePatient;

    @Column(name = "Age_Patient", nullable = false)
    private Integer agePatient;

    @Column(name = "Identification_number_Patient", nullable = false)
    private Long identificationNumberPatient;



}