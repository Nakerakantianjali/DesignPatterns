package com.company.StructuralPattern.BridgePattern;

public class Messenger implements IMessage{
    @Override
    public void sendMessage(String msg) {
        System.out.println("msg"+msg);

    }
}
