package com.company.AbstractFactory;

public class MobileFactory extends OPeratingSystemFactory{
    @Override
    public OPeratingSystem getType(String Type) {
        if(Type.equals("Android")){
            return new Android();
        }
        return new IOS();
    }
}
