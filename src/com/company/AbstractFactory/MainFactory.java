package com.company.AbstractFactory;

public class MainFactory {
    public static OPeratingSystemFactory getFactory(String Type){
        if(Type.equals("Mobile")){
            return  new MobileFactory();
        }
        return new LaptopFactory();
    }
}
