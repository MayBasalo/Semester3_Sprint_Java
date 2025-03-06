package src.models;

import java.time.LocalDate;

/**
 * Models a medication within the pharmacy system.
 * Every medication is identified by an ID, name, quantity, dosage, and expiration date.
 * 
 * @author May Basalo
 */
public class Medication {
    private final String id;
    private String name;
    private int quantity;
    private String dosage;  // NEW FIELD
    private LocalDate expiryDate;

    /**
     * Constructs a new Medication.
     * 
     * @param id          The unique identifier for the medication.
     * @param name        The name of the medication.
     * @param quantity    The stock quantity.
     * @param dosage      The dosage information (e.g., "500mg").
     * @param expiryDate  The expiration date of the medication.
     */
    public Medication(String id, String name, int quantity, String dosage, LocalDate expiryDate) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.dosage = dosage;
        this.expiryDate = expiryDate;
    }

    /** Retrieves the medication's ID.. */
    public String getId() { return id; }

    /**Retrieves the medication's name.. */
    public String getName() { return name; }

    /** Retrieves the medication's quantity. */
    public int getQuantity() { return quantity; }

    /** Retrieves the medication's dosage. */
    public String getDosage() { return dosage; }

    /** Retrieves the medication's expiration date. */
    public LocalDate getExpiryDate() { return expiryDate; }

    /** Sets a new name for the medication. */
    public void setName(String name) { this.name = name; }

    /** Sets a new stock quantity for the medication. */
    public void setQuantity(int quantity) { this.quantity = quantity; }

    /**
     * Sets a new expiry date for the medication.
     * 
     * @param expiryDate The new expiration date.
     */
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }


    /** Sets a new dosage for the medication. */
    public void setDosage(String dosage) { this.dosage = dosage; }

    /** Returns a string representation of the medication. */
    @Override
    public String toString() {
        return "Medication{" +
            "ID='" + id + '\'' +
            ", Name='" + name + '\'' +
            ", Quantity=" + quantity +
            ", Dosage='" + dosage + '\'' +  // UPDATED
            ", Expiry Date=" + expiryDate +
            '}';
    }
}
