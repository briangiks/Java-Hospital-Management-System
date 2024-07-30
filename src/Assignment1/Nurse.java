package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class Nurse extends Person {
    private int staffID;
    private int yearsOfExperience;
    private List<Integer> wardsAllocated;

    public Nurse(String name, int age, String gender, int newStaffID, int newYearsOfExperience, int[] newWardsAllocated) {
        super(name, age, gender);
        this.staffID = newStaffID;
        this.yearsOfExperience = newYearsOfExperience;
        this.wardsAllocated = new ArrayList<>();
        for (int ward : newWardsAllocated) {
            this.wardsAllocated.add(ward);
        }
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int newStaffID) {
        this.staffID = newStaffID;
    }
    
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public List<Integer> getWardsAllocated() {
        return wardsAllocated;
    }

    public void setWardsAllocated(int[] newWardsAllocated) {
        this.wardsAllocated.clear();
        for (int ward : newWardsAllocated) {
            this.wardsAllocated.add(ward);
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Nurse ID: " + staffID);
        System.out.println("Nurse Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Years Of Experience: " + yearsOfExperience);
        System.out.println("Wards Allocated: " + wardsAllocated);
    }
    
    // Additional methods for the Nurse class

    // Method to administer medication to a patient
    public void administerMedication(Patient patient, String medication) {
        System.out.println("Administered " + medication + " to " + patient.getName());
    }

    // Method to check vital signs of a patient
    public void checkVitalSigns(Patient patient) {
        System.out.println("Checked vital signs of " + patient.getName());
    }

    // Method to assist in a medical procedure
    public void assistProcedure(String procedure) {
        System.out.println("Assisted in " + procedure);
    }
    
    // Method to allocate new ward
    public void allocateWard(int ward) {
        if (!wardsAllocated.contains(ward)) {
            wardsAllocated.add(ward);
            System.out.println("Ward " + ward + " allocated to nurse " + getName());
        } else {
            System.out.println("Ward " + ward + " is already allocated to nurse " + getName());
        }
    }
    
    // Method to deallocate a ward
    public void deallocateWard(int ward) {
        if (wardsAllocated.contains(ward)) {
            wardsAllocated.remove(Integer.valueOf(ward));
            System.out.println("Ward " + ward + " deallocated from nurse " + getName());
        } else {
            System.out.println("Ward " + ward + " is not allocated to nurse " + getName());
        }
    }
}
