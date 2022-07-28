package com.sofka.saint_claire.Entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AppointmentId implements Serializable {
    private static final long serialVersionUID = -4046134656880529153L;
    @Column(name = "id_Appointment", nullable = false)
    private Integer idAppointment;

    @Column(name = "Medical_Specialty_id_Medical_Specialty", nullable = false)
    private Integer medicalSpecialtyIdMedicalSpecialty;

    @Column(name = "Patient_id_Patient", nullable = false)
    private Integer patientIdPatient;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AppointmentId entity = (AppointmentId) o;
        return Objects.equals(this.idAppointment, entity.idAppointment) &&
                Objects.equals(this.medicalSpecialtyIdMedicalSpecialty, entity.medicalSpecialtyIdMedicalSpecialty) &&
                Objects.equals(this.patientIdPatient, entity.patientIdPatient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAppointment, medicalSpecialtyIdMedicalSpecialty, patientIdPatient);
    }

}