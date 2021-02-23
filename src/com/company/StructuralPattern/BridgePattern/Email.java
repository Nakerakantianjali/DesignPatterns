package com.company.StructuralPattern.BridgePattern;

public class Email implements IMessage{
    @Override
    public void sendMessage(String msg) {
        System.out.println("msg"+msg);
    }
}
