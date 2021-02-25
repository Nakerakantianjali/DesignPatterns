package com.company.BehaviouralPattern.MediatorPattern;

public class User {

    String fName;
    String Lname;
    public User(String fName, String lname) {
        this.fName = fName;
        Lname = lname;
    }

    public User() {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }
    public  void sendMessae(){
        Message message= new Message();
        message.viewMessage(this,"hello");
    }
}
