package src.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a patient within the pharmacy system.
 * A patient may have multiple prescriptions.
 * 
 * @author May Basalo
 */
public class Patient extends Person {
    private final List<Prescription> prescriptions;

    /**
     * Constructs a new Patient with the given details.
     * 
     * @param id          The unique identifier for the patient.
     * @param name        The name of the patient.
     * @param age         The age of the patient.
     * @param phoneNumber The patient's contact number.
     */
    public Patient(String id, String name, int age, String phoneNumber) {
        super(id, name, age, phoneNumber); // Calls the constructor of Person
        this.prescriptions = new ArrayList<>();
    }

    /**
     * Retrieves the patient's name.
     * 
     * @return The name of the patient.
     */
    @Override
    public String getName() {
        return super.getName();
    }

    /**
     * Assigns the patient's name.
     * 
     * @param name The new name of the patient.
     */
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    /**
     * Retrieves the patient's age.
     * 
     * @return The age of the patient.
     */
    @Override
    public int getAge() {
        return super.getAge();
    }

    /**
     * Updates the patient's age.
     * 
     * @param age The new age of the patient.
     */
    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    /**
     * Retrieves the patient's contact number.
     * 
     * @return The phone number of the patient.
     */
    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    /**
     * Updates the patient's contact numbe.
     * 
     * @param phoneNumber The new phone number of the patient.
     */
    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    /**
     *Includes a prescription in the patient's records.
     * 
     * @param prescription The prescription to add.
     */
    public void addPrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }

    /**
     * Retrieves the patient's assigned prescription.
     * 
     * @return The list of prescriptions.
     */
    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    /**
     * Provides a textual representation of the patient.
     * 
     * @return A formatted string containing patient details.
     */
    @Override
    public String toString() {
        return "Patient{" +
            "ID='" + getId() + '\'' +
            ", Name='" + getName() + '\'' +
            ", Age=" + getAge() +
            ", Phone Number='" + getPhoneNumber() + '\'' +
            ", Prescriptions Count=" + prescriptions.size() +
            '}';
    }
}