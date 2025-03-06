package src.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines a doctor within the pharmacy system.
 * A doctor may be responsible for multiple patients.
 * 
 * @author May Basalo
 */
public class Doctor extends Person {
    private String specialty;
    private final List<Patient> patients;

    /**
     * Creates a new Doctor with the specified information..
     * 
     * @param id          The unique identifier for the doctor.
     * @param name        The name of the doctor.
     * @param age         The age of the doctor.
     * @param phoneNumber The doctor's contact number.
     * @param specialty   The doctor's medical specialty.
     */
    public Doctor(String id, String name, int age, String phoneNumber, String specialty) {
        super(id, name, age, phoneNumber); // Calls the constructor of Person
        this.specialty = specialty;
        this.patients = new ArrayList<>();
    }

    /**
     * Retrieves the doctor's name.
     * 
     * @return The name of the doctor.
     */
    @Override
    public String getName() {
        return super.getName();
    }

    /**
     * Assigns the doctor's name.
     * 
     * @param name The new name of the doctor.
     */
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    /**
     * Retrieves the doctor's age.
     * 
     * @return The age of the doctor.
     */
    @Override
    public int getAge() {
        return super.getAge();
    }

    /**
     * Updates the doctor's age.
     * 
     * @param age The new age of the doctor.
     */
    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    /**
     * Retrieves the doctor's phone number.
     * 
     * @return The phone number of the doctor.
     */
    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    /**
     * Assigns the doctor's phone number.
     * 
     * @param phoneNumber The new phone number of the doctor.
     *      */
    
    @Override
    public void setPhoneNumber(String phoneNumber) {


        super.setPhoneNumber(phoneNumber);
    }

    /**
     * Gets the doctor's specialty.
     * 
     * @return The medical specialty of the doctor.
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * Sets the doctor's specialty.
     * 
     * @param specialty The new specialty of the doctor.
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * Adds a patient to the doctor's list.
     * 
     * @param patient The patient to add.
     */
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    /**
     * Gets the list of patients assigned to the doctor.
     * 
     * @return The list of patients.
     */
    public List<Patient> getPatients() {
        return patients;
    }

    /**
     * Returns a string representation of the doctor.
     * 
     * @return A formatted string containing doctor details.
     */
    @Override
    public String toString() {
        return "Doctor{" +
            "ID='" + getId() + '\'' +
            ", Name='" + getName() + '\'' +
            ", Age=" + getAge() +
            ", Phone Number='" + getPhoneNumber() + '\'' +
            ", Specialty='" + specialty + '\'' +
            '}';
    }
}