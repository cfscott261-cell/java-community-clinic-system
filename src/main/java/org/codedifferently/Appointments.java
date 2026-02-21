package org.codedifferently;

public class Appointments {
    private PatientName patient;
    private int timeSlot;

    public Appointments(PatientName, int timeSlot) {
        this.patient = patient;
        this.timeSlot = timeSlot;
    }

    public PatientName getPatient() {
        return patient;
    }

    public int getTimeSlot() {
        return timeSlot;
    }

    public String toString() {
        return "Time Slot: " + timeSlot + ": " + patient;
    }
}

