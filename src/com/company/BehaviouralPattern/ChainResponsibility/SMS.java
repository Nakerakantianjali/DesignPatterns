package com.company.BehaviouralPattern.ChainResponsibility;

public class SMS extends  Message{
    public SMS() {
    }

    public  SMS(int level){
        this.level=level;
    }
    @Override
    public void writeMessage(String message) {
        System.out.println("SMS :"+ message);
    }
}
