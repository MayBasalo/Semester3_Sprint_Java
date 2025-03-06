package src.models;

import java.time.LocalDate;

/**
 * Represents a prescription within the pharmacy system..
 *Each prescription is associated with a specific doctor, patient, and medication.
 * 
 * @author May Basalo
 */
public class Prescription {
    private final String id;
    private final Doctor doctor;
    private final Patient patient;
    private final Medication medication;
    private final LocalDate prescriptionExpiry;

    /**
     * Creates a new Prescription.
     * 
     * @param id                 The unique identifier for the prescription.
     * @param doctor             The doctor issuing the prescription.
     * @param patient            The patient receiving the prescription.
     * @param medication         The prescribed medication.
     * @param prescriptionExpiry The expiration date of the prescription.
     */
    public Prescription(String id, Doctor doctor, Patient patient, Medication medication, LocalDate prescriptionExpiry) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.medication = medication;
        this.prescriptionExpiry = prescriptionExpiry;
    }

    /**
     * Retrieves the prescription ID.
     * 
     * @return The prescription ID.
     */
    public String getId() {
        return id;
    }

    /**
     * Retrieves the doctor who issued the prescription.
     * 
     * @return The doctor.
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * Retrieves the patient associated with the prescription.
     * 
     * @return The patient.
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Gets the prescribed medication.
     * 
     * @return The medication.
     */
    public Medication getMedication() {
        return medication;
    }

    /**
     * Retrieves the expiration date of the prescription.
     * 
     * @return The prescription expiration date.
     */
    public LocalDate getPrescriptionExpiry() {
        return prescriptionExpiry;
    }

    /**
     * Returns a string that represents the details of the prescription.
     * 
     * @return A formatted string containing prescription details.
     */
    @Override
    public String toString() {
        return "Prescription{" +
            "ID='" + id + '\'' +
            ", Doctor='" + doctor.getName() + '\'' +
            ", Patient='" + patient.getName() + '\'' +
            ", Medication='" + medication.getName() + '\'' +
            ", Expiry Date=" + prescriptionExpiry +
            '}';
    }
}
