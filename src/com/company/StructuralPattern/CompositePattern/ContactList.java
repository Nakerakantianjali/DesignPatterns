package com.company.StructuralPattern.CompositePattern;

import java.util.List;

public class ContactList {
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public List<ContactList>contactlist;

    public ContactList() {
    }

    public ContactList(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public ContactList(String firstName, String lastName, String phoneNumber, List<ContactList> contactlist) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.contactlist = contactlist;
    }
    public void AddContact(ContactList contactList){
        contactlist.add(contactList);
    }
    public  void deleteContact(ContactList contactList){
        contactlist.remove(contactList);
    }

    public List<ContactList> getContactlist() {
        return contactlist;
    }
}
