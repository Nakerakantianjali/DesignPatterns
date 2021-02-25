package com.company.BehaviouralPattern.ChainResponsibility;

public class ChainPattern {
    public static  Message getMessage(){
        Message email = new Email(1);
        Message sms = new SMS(2);
        email.setNextMessenger(sms);
        return email;
    }
}
