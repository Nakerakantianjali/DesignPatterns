package com.company.FactoryPattern;

public class OPeratingSystemFactory {
    public OperatingSystem getOPeratingSystemType(String Type){
        if(Type.equals("Android")){
            return new Android();
        }
        else if(Type.equals("Windows")){
            return new Windows();
        }
        else {
            return new IOS();
        }

    }
}
