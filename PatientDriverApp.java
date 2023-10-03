package main;

import java.text.DecimalFormat;

public class PatientDriverApp {
    public static void main(String[] args) {
        // Create a patient instance using the no-arg constructor (prompts user for input)
        Patient patient = new Patient();

        // Create three instances of the Procedure class
        Procedure procedure1 = new Procedure("Physical Exam", "06/12/2023", "Dr. Anderson", 150.50);
        Procedure procedure2 = new Procedure("X-ray", "06/15/2023");
        procedure2.setPractitionerName("Dr. Smith");
        procedure2.setProcedureCharges(200.00);
        Procedure procedure3 = new Procedure();
        procedure3.setProcedureName("Blood Test");
        procedure3.setProcedureDate("06/18/2023");
        procedure3.setPractitionerName("Dr. Johnson");
        procedure3.setProcedureCharges(75.75);

        // Display patient information
        displayPatient(patient);

        // Display procedure information for each procedure
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate and display the total charges for the three procedures
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.println("Total Charges for Procedures: $" + new DecimalFormat("0.00").format(totalCharges));
    }

    // Method to display patient information
    public static void displayPatient(Patient patient) {
        System.out.println(patient.toString());
    }

    // Method to display procedure information
    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure.toString());
    }

    // Method to calculate the total charges for three procedures
    public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        return procedure1.getProcedureCharges() + procedure2.getProcedureCharges() + procedure3.getProcedureCharges();
    }
}