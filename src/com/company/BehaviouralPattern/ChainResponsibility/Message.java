package com.company.BehaviouralPattern.ChainResponsibility;

public  abstract class  Message {
    Message nextMessenger;
    int level;
    public  void setNextMessenger(Message message){
        this.nextMessenger=message;
    }
    public void logMessage(int level, String message){
        if(this.level <= level){
            writeMessage(message);
        }
        if(nextMessenger !=null){
            nextMessenger.logMessage(level, message);
        }
    }

    public  abstract  void writeMessage(String message);
}
