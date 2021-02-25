package com.company.BehaviouralPattern.IteratorPattern;

public class Contact {
    String fName;
    String lname;
    String phoneNumber;

    public Contact() {
    }

    public Contact(String fName, String lname, String phoneNumber) {
        this.fName = fName;
        this.lname = lname;
        this.phoneNumber = phoneNumber;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
