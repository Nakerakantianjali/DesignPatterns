package com.company.StructuralPattern.BridgePattern;

public abstract class Message  {
public  IMessage iMessage;
public abstract void sendMessage(String message);
}
