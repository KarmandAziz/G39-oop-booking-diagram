package org.example.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Booking {

    private final String Id;
    private LocalDateTime dateTime;
    private double price;
    private String administrator;
    private String vaccineName;
    private boolean vacant;
    private Premises premises;
    private Patient patient;

       //constructors

    public Booking(
            String id,
            LocalDateTime dateTime,
            double price,
            String administrator,
            String vaccineName,
            Premises premises,
            boolean vacant,
            Patient patient) {

        if(id==null) throw new RuntimeException("Id was null");
        Id = id;
        setDateTime(dateTime);
        setPrice(price);
        setAdministrator(administrator);
        setVaccineName(vaccineName);
        setVacant(vacant);
        setPatient(patient);
    }

    public Booking(LocalDateTime dateTime, double price, String vaccineName, Premises premises) {
        this(UUID.randomUUID().toString(), dateTime, price, null, vaccineName, premises,true, null);
    }

    //getters and setters

    public String getId() {
        return Id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public boolean isVacant() {
        return vacant;
    }

    private void setVacant(boolean vacant) {
        this.vacant = vacant;
    }

    public Premises getPremises() {
        return premises;
    }

    public void setPremises(Premises premises) {
        if(premises == null) throw new RuntimeException("Premises was null");
        this.premises = premises;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
        setVacant(this.patient == null);
    }
}
