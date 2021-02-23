package com.company.StructuralPattern.BridgePattern;

public class IOS extends Message{
    public IOS(){}
    public IOS(IMessage message){
        this.iMessage=message;
    }
    @Override
    public void sendMessage(String message) {
        iMessage.sendMessage(message);
    }
}
