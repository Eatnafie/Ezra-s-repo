package main;

public class Procedure {
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double procedureCharges;

    // No-arg constructor
    public Procedure() {
    }

    // Parametrized constructor for name and date
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    // Parametrized constructor for all attributes
    public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharges = procedureCharges;
    }

    // Accessors and mutators for all attributes

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public String getProcedureDate() {
        return procedureDate;
    }

    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public double getProcedureCharges() {
        return procedureCharges;
    }

    public void setProcedureCharges(double procedureCharges) {
        this.procedureCharges = procedureCharges;
    }

    // toString method to display procedure information
    @Override
    public String toString() {
        return "Procedure Information:\n" +
                "Procedure Name: " + procedureName + "\n" +
                "Procedure Date: " + procedureDate + "\n" +
                "Practitioner Name: " + practitionerName + "\n" +
                "Procedure Charges: $" + procedureCharges;
    }
}