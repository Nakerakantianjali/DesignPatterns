package com.company.FactoryPattern;

public class IOS implements  OperatingSystem{
    @Override
    public void getversion() {
        System.out.println("version of IOS is: 10");
    }

    @Override
    public void getSpecifications() {
        System.out.println("Specifications of IOS");

    }
}
