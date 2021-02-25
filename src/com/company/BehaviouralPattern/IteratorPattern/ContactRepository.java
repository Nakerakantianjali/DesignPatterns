package com.company.BehaviouralPattern.IteratorPattern;

import java.util.ArrayList;

public class ContactRepository implements Container{
    public ArrayList<Contact> contactList = new ArrayList<>();
    public ContactRepository(){
        Contact contact = new Contact("anjali","madhavi","908076543");
        contactList.add(contact);
    }
    @Override
    public Iterator getIterator() {
        return new  ContactIterator();
    }
    public  class  ContactIterator implements Iterator{
        int index=0;
        @Override
        public boolean hasNext() {
            if(index < contactList.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return contactList.get(index++);
            }
            return null;
        }
    }
}
