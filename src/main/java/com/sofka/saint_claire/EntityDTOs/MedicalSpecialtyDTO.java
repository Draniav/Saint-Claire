package com.sofka.saint_claire.EntityDTOs;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MedicalSpecialtyDTO implements Serializable {


    @Data
    public class MedicalSpecialityDTO {
        private Long specialityId;
        private String name;
        private String physicianInCharge;
        private List<PatientDTO> patients = new ArrayList<>();
    }
}
