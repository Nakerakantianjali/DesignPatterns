package com.company.AbstractFactory;

public class LaptopFactory  extends OPeratingSystemFactory{
    @Override
    public OPeratingSystem getType(String Type) {
        if(Type.equals("Windows")){
        return new Windows();
    }
        return new IOS();

    }
}
