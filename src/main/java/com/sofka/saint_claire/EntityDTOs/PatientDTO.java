package com.sofka.saint_claire.EntityDTOs;

import lombok.Data;

@Data
public class PatientDTO {
    private String name;
    private int age;
    private Long dni;
    private int numberOfAppointments;
    private int medicalSpecialityId;



}
