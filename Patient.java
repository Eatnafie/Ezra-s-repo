package main;

import java.util.Scanner;

public class Patient {
    private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String emergencyContactName;
    private String emergencyContactPhone;

    // No-arg constructor
    public Patient() {
        // Prompt the user for patient information
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        this.firstName = scanner.nextLine();
        System.out.print("Enter Middle Name: ");
        this.middleName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        this.lastName = scanner.nextLine();
        
        System.out.print("Enter Street Address: ");
        this.streetAddress = scanner.nextLine();
        System.out.print("Enter City: ");
        this.city = scanner.nextLine();
        System.out.print("Enter State: ");
        this.state = scanner.nextLine();
        System.out.print("Enter ZIP Code: ");
        this.zipCode = scanner.nextLine();
        
        System.out.print("Enter Phone Number (example 301-123-4567): ");
        this.phoneNumber = scanner.nextLine();
        System.out.print("Enter Emergency Contact Name: ");
        this.emergencyContactName = scanner.nextLine();
        System.out.print("Enter Emergency Contact Phone: ");
        this.emergencyContactPhone = scanner.nextLine();
    }

    // Parametrized constructor for name
    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // Parametrized constructor for all attributes
    public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state,
                   String zipCode, String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

    // Accessors and mutators for all attributes

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    // Method to build full name
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    // Method to build address
    public String buildAddress() {
        return streetAddress + ", " + city + ", " + state + " " + zipCode;
    }

    // Method to build emergency contact
    public String buildEmergencyContact() {
        return emergencyContactName + " " + emergencyContactPhone;
    }

    // toString method to display patient information
    @Override
    public String toString() {
        return "Patient Information:\n" +
                "Full Name: " + buildFullName() + "\n" +
                "Address: " + buildAddress() + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Emergency Contact: " + buildEmergencyContact();
    }

    public static void main(String[] args) {
        // Create a patient instance using the no-arg constructor (prompts user for input)
        Patient patient = new Patient();
        
        // Display patient information
        System.out.println(patient.toString());
    }
}