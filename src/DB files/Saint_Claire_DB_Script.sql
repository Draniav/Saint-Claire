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
-- Table Appointment
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Appointment (
  id_Appointment INT NOT NULL,
  date_Appointment DATE NOT NULL,
  Patient_id_Patient INT NOT NULL,
  PRIMARY KEY (id_Appointment),
  INDEX fk_Appointment_Patient1_idx (Patient_id_Patient ASC) VISIBLE,
  CONSTRAINT fk_Appointment_Patient1
    FOREIGN KEY (Patient_id_Patient)
    REFERENCES Patient (id_Patient)
 
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table Medical_Specialty
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Medical_Specialty (
  id_Medical_Specialty INT NOT NULL,
  Name_Medical_Specialty VARCHAR(100) NOT NULL,
  Physician_in_charge_Medical_Specialty VARCHAR(45) NOT NULL,
  Appointment_id_Appointment INT NOT NULL,
  PRIMARY KEY (id_Medical_Specialty),
  INDEX fk_Medical_Specialty_Appointment1_idx (Appointment_id_Appointment ASC) VISIBLE,
  CONSTRAINT fk_Medical_Specialty_Appointment1
    FOREIGN KEY (Appointment_id_Appointment)
    REFERENCES Appointment (id_Appointment)

    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;