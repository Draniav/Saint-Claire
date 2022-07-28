-- -----------------------------------------------------
-- Schema Saint_Claire_DB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS Saint_Claire_DB DEFAULT CHARACTER SET utf8 ;
USE Saint_Claire_DB ;

-- -----------------------------------------------------
-- Table Patient
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Patient (
  id_Patient INT NOT NULL,
  Name_Patient VARCHAR(45) NOT NULL,
  Age_Patient INT NOT NULL,
  Identification_number_Patient BIGINT(20) NOT NULL,
  PRIMARY KEY (id_Patient))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table Medical_Specialty
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Medical_Specialty (
  id_Medical_Specialty INT NOT NULL,
  Name_Medical_Specialty VARCHAR(100) NOT NULL,
  Physician_in_charge_Medical_Specialty VARCHAR(45) NOT NULL,
  PRIMARY KEY (id_Medical_Specialty))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table Appointment
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Appointment (
  id_Appointment INT NOT NULL,
  date_Appointment DATE NOT NULL,
  Patient_id_Patient INT NOT NULL,
  Medical_Specialty_id_Medical_Specialty INT NOT NULL,
  PRIMARY KEY (id_Appointment),
  INDEX fk_Appointment_Patient1_idx (Patient_id_Patient ASC) VISIBLE,
  INDEX fk_Appointment_Medical_Specialty1_idx (Medical_Specialty_id_Medical_Specialty ASC) VISIBLE,
  CONSTRAINT fk_Appointment_Patient1
    FOREIGN KEY (Patient_id_Patient)
    REFERENCES Patient (id_Patient)
    ON DELETE  RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT fk_Appointment_Medical_Specialty1
    FOREIGN KEY (Medical_Specialty_id_Medical_Specialty)
    REFERENCES Medical_Specialty (id_Medical_Specialty)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;