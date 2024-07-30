package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person {
    private int staffID;
    private String specialization;

    // List to hold patient appointments
    private List<String> appointments;

    public Doctor(String name, int age, String gender, int newStaffID, String specialization) {
        super(name, age, gender);
        this.staffID = newStaffID;
        this.specialization = specialization;
        this.appointments = new ArrayList<>();
    }
    
    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int newStaffID) {
        this.staffID = newStaffID;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        System.out.println("Doctor's ID: " + staffID);
        System.out.println("Doctor's Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Specialization: " + specialization);
    }

    // Method to schedule an appointment for a patient
    public void scheduleAppointment(String patientName, String date) {
        String appointment = "Appointment for " + patientName + " on " + date;
        appointments.add(appointment);
        System.out.println("Appointment scheduled: " + appointment);
    }

    // Method to update patient records
    public void updatePatientRecord(Patient patient, String newAilment, String newReportDate) {
        patient.setAilment(newAilment);
        patient.setAppointmentDate(newReportDate);
        System.out.println("Patient record updated for " + patient.getName());
    }

    // Method to diagnose a patient
    public void diagnose(Patient patient, String diagnosis) {
        patient.setAilment(diagnosis);
        System.out.println("Diagnosed " + patient.getName() + " with " + diagnosis);
    }

    // Method to prescribe medication to a patient
    public void prescribeMedication(Patient patient, String medication) {
        System.out.println("Prescribed " + medication + " to " + patient.getName());
    }
}
