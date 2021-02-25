package com.company.BehaviouralPattern.MediatorPattern;

public class Message {
    public void viewMessage(User user,String message){
        System.out.println(user.getfName()+"message :" +message);
    }
}
