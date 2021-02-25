package com.company.BehaviouralPattern.ChainResponsibility;

public class Email extends  Message{
    public Email() {
    }

    public  Email(int level){
        this.level=level;
    }
    @Override
    public void writeMessage(String message) {
        System.out.println("Email :"+message);
    }
}
