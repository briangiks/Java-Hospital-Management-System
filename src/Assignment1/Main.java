package Assignment1;

public class Main {
    public static void main(String[] args) {
       Patient patient1 = new Patient("Brian", 19, "Male", 157654, "Cold", "12/01/2024", "15/02/2024");
       int[] wards = {101, 103, 105};
       Nurse nurse1 = new Nurse("Sabrina", 24, "Female", 167891, 2, wards);
       Doctor doctor1 = new Doctor("Tom", 26, "Male", 123456, "Surgeon");
       
       //patient1.displayDetails();
       //nurse1.displayDetails();
       //doctor1.displayDetails();
       
        nurse1.checkVitalSigns(patient1);
    }
}
