package org.example.model;

import java.util.UUID;

public class ContactInfo {

    private final String id;
    private String email;
    private String phone;

    public ContactInfo(String id, String email, String phone) {
        if(id == null) throw new RuntimeException("Id was null");
        this.id = id;
        setEmail(email);
        setPhone(phone);
    }

    public ContactInfo(String email, String phone) {
       this(UUID.randomUUID().toString(), email, phone);
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
