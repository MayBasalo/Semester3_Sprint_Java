package src.test; 
import java.time.LocalDate;
import src.models.Doctor;
import src.models.Medication;
import src.models.MedicationTrackingSystem;
import src.models.Patient;

/**
 * A test class for the MedicationTrackingSystem, showcasing its key functionalities
 * This involves adding medications, searching for records, restocking inventory, and generating reports.
 * 
 * @author May Basalo
 */
public class TestMedicationTrackingSystem {
    public static void main(String[] args) {
        // Create the system instance
        MedicationTrackingSystem system = new MedicationTrackingSystem();

        // ****** TESTING MEDICATION MANAGEMENT adding dosage ******
        System.out.println("\n*** Adding Medications ***");
        Medication med1 = new Medication("M101", "Theraflu", 25, "12ml", LocalDate.of(2025, 7, 15)); // Changed medication and dosage
        Medication med2 = new Medication("M102", "Paracetamol", 18, "750mg", LocalDate.of(2023, 11, 10)); // Changed medication and dosage
        Medication med3 = new Medication("M103", "Naproxen", 35, "500mg", LocalDate.of(2024, 9, 30)); // Changed medication and dosage

        system.addMedication(med1);
        system.addMedication(med2);
        system.addMedication(med3);
        
        // Deleting a medication
        System.out.println("\n*** Deleting Medication ***");
        system.deleteMedication("M102");
 
        // ****** TESTING PATIENT AND DOCTOR MANAGEMENT ******
        System.out.println("\n*** Adding Doctors and Patients ***");
        Doctor doc1 = new Doctor("D101", "Dr. Robert Green", 50, "555-7777", "Cardiology"); // Changed doctor details
        Doctor doc2 = new Doctor("D102", "Dr. Emily White", 42, "555-8888", "Neurology"); // Changed doctor details
        Doctor doc3 = new Doctor("D103", "Dr. Oliver Black", 38, "555-9999", "Pediatrics"); // Changed doctor details
 
        Patient pat1 = new Patient("P101", "Chris Johnson", 32, "555-1234"); // Changed patient name and phone number
        Patient pat2 = new Patient("P102", "Sophia Taylor", 29, "555-4321"); // Changed patient name
        Patient pat3 = new Patient("P103", "Liam Martinez", 40, "555-5678"); // Changed patient name
 
        system.getDoctors().add(doc1);
        system.getDoctors().add(doc2);
        system.getDoctors().add(doc3);
         
        system.getPatients().add(pat1);
        system.getPatients().add(pat2);
        system.getPatients().add(pat3);

        doc1.addPatient(pat1);
        doc2.addPatient(pat2);
        doc3.addPatient(pat3);

 
        // Assign patients to doctors
        system.addPatientToDoctor("D101", pat1);
        system.addPatientToDoctor("D102", pat2);
        system.addPatientToDoctor("D103", pat3);

        // Editing a medication
        System.out.println("\n*** Editing Medication ***");
        system.editMedication("M103", "Naproxen (500mg)", 45, "600mg"); // Changed medication dosage

        // Deleting a patient
        System.out.println("\n*** Deleting Patient ***");
        system.deletePatient("P101");
        
        // Deleting a doctor
        System.out.println("\n*** Deleting Doctor ***");
        system.deleteDoctor("D102"); 

        // ****** GENERATING SYSTEM REPORT ******
        System.out.println("\n*** Generating System Report ***");
        system.generateSystemReport();
        
        // *** CHECKING FOR EXPIRED MEDICATIONS ***
        System.out.println("\n*** Checking for Expired Medications ***");
        system.checkForExpiredMedications();

        // Accepting prescriptions
        System.out.println("\n*** Accepting Prescriptions ***");
        system.acceptPrescription("PRESC001", "D101", "P101", "M101", LocalDate.of(2025, 6, 25)); // Changed prescription dates
        system.acceptPrescription("PRESC002", "D102", "P102", "M103", LocalDate.of(2026, 3, 5)); // Changed prescription dates
        system.acceptPrescription("PRESC003", "D101", "P103", "M101", LocalDate.of(2025, 12, 10)); // Changed prescription dates
 
        // ****** PRINT PRESCRIPTIONS BY DOCTOR ******
        System.out.println("\n*** Printing Prescriptions by Dr. Robert Green (D101) ***");
        system.printPrescriptionsByDoctor("D101");

        // ****** RESTOCKING MEDICATIONS ******
        System.out.println("\n*** Restocking Medications ***");
        system.restockMedication("M101", 15); // Add 15 units to Theraflu
        system.restockMedication("M103", 25); // Add 25 units to Naproxen
        
        // ****** TESTING EDITING PATIENT AND DOCTOR ******
        System.out.println("\n*** Editing Patient ***");
        system.editPatient("P102", "Sophia Williams", 30, "555-3333"); // Changed patient details

        System.out.println("\n*** Editing Doctor ***");
        system.editDoctor("D101", "Dr. Robert Greenstein", 51, "555-6666", "Cardiovascular Surgery"); // Changed doctor details

        // Verify updates by printing the updated patient and doctor details
        System.out.println("\n*** Updated Patient Details ***");
        for (Patient pat : system.getPatients()) {
            if (pat.getId().equals("P101")) {
                System.out.println(pat);
            }
        }

        System.out.println("\n*** Updated Doctor Details ***");
        for (Doctor doc : system.getDoctors()) {
            if (doc.getId().equals("D101")) {
                System.out.println(doc);
            }
        }
    }
}

