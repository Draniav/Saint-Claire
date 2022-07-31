DROP DATABASE Saint_Claire_DB;



-- -----------------------------------------------------
-- Schema Saint_Claire_DB
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Saint_Claire_DB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS Saint_Claire_DB DEFAULT CHARACTER SET utf8 ;
USE Saint_Claire_DB ;

-- -----------------------------------------------------
-- Table Medical_Specialty
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Medical_Specialty (
  id_Medical_Specialty INT NOT NULL AUTO_INCREMENT,
  Name_Medical_Specialty VARCHAR(100) NOT NULL,
  Physician_in_charge_Medical_Specialty VARCHAR(45) NOT NULL,
  PRIMARY KEY (id_Medical_Specialty))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table Patient
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Patient (
  id_Patient INT NOT NULL AUTO_INCREMENT,
  Name_Patient VARCHAR(45) NOT NULL,
  Age_Patient INT NOT NULL,
  Identification_number_Patient BIGINT(20) NOT NULL,
  number_of_appointment INT NOT NULL,
  Medical_Specialty_id_Medical_Specialty INT NOT NULL,
  PRIMARY KEY (id_Patient),
  INDEX fk_Patient_Medical_Specialty_idx (Medical_Specialty_id_Medical_Specialty ASC) VISIBLE,
  CONSTRAINT fk_Patient_Medical_Specialty
    FOREIGN KEY (Medical_Specialty_id_Medical_Specialty)
    REFERENCES Medical_Specialty (id_Medical_Specialty)
     ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table Appointment
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Appointment (
  id_Appointment INT NOT NULL AUTO_INCREMENT,
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




select count(*) patient_01 FROM patient WHERE Name_Patient='patient 01';



INSERT INTO medical_specialty
VALUES 
(1,'Allergology', 'Pedro Perez')
(2, 'Anesthesiology', 'Pablo Pinto'),
(3, 'Genetics', 'Martha Smith'),
(4, 'Hematology', 'Martin Mcmillan');

INSERT INTO medical_specialty
VALUES 
(5,'Orthopedics', 'Pedro Perez')