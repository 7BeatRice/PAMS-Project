
public class PatientAppointment {
    int patientID;
   String patientName;
    String appointmentTime;

    public PatientAppointment(int patientID, String patientName, String appointmentTime) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.appointmentTime = appointmentTime;
    }
    public String getAppointmentTime() {
        return appointmentTime;
    }
    @Override
    public String toString() {
        return patientID + ", " + patientName + ", " + appointmentTime;
    }
}
