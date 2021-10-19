package org.example.model;

import java.util.UUID;

public class Premises {

    private final String Id;
    private String name;
    private Address address;
    private ContactInfo contactInfo;


    public Premises(String Id, String name, Address address, ContactInfo contactInfo) {

       if(Id == null) throw new RuntimeException("Id was null");
        this.Id = Id;
        setName(name);
        setAddress(address);
        setContactInfo(contactInfo);
    }

    public Premises(String name, Address address) {
        this(UUID.randomUUID().toString(), name, address, null);
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)  {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) throws RuntimeException{
        if(address == null) throw new RuntimeException("Address was null!");
        this.address = address;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
}
