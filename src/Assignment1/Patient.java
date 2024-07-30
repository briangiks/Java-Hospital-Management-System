package Assignment1;

public class Patient extends Person {
    public int patientID;
    private String ailment;
    private String reportDate;
    private String makeAppointment;
    
    public Patient(String name, int age, String gender, int newPatientID, String newAilment, String newReportDate, String newMakeAppointment){
        super(name, age, gender);
        this.patientID = newPatientID;
        this.ailment = newAilment;
        this.reportDate = newReportDate;
        this.makeAppointment = newMakeAppointment;
    }
    
    public String getAilment(){
        return ailment;
    }
    
    public void setAilment(String newAilment){
        this.ailment = newAilment;
    }
    
    public String getAppointmentDate(){
        return makeAppointment;
    }
    
    public void setAppointmentDate(String newAppointmentDate){
        this.makeAppointment = newAppointmentDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Patient ID: "+patientID);
        System.out.println("Patient Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Gender: "+getGender());
        System.out.println("Report Date: "+reportDate);
        System.out.println("Ailment: "+ailment);
        }
    
    public void printAppointmentDate(String name, String appointmentDate){
        System.out.println(name+ " next appointment date is on "+appointmentDate);
    }
}