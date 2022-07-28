package com.sofka.saint_claire.Entity;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamePatient() {
        return namePatient;
    }

    public void setNamePatient(String namePatient) {
        this.namePatient = namePatient;
    }

    public Integer getAgePatient() {
        return agePatient;
    }

    public void setAgePatient(Integer agePatient) {
        this.agePatient = agePatient;
    }

    public Long getIdentificationNumberPatient() {
        return identificationNumberPatient;
    }

    public void setIdentificationNumberPatient(Long identificationNumberPatient) {
        this.identificationNumberPatient = identificationNumberPatient;
    }

}