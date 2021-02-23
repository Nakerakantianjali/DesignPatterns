package com.company.StructuralPattern.BridgePattern;

public class Android extends  Message{
    public Android(){}
    public  Android(IMessage iMessage){
        this.iMessage=iMessage;
    }
    @Override
    public void sendMessage(String message) {
        iMessage.sendMessage(message);
    }
}
