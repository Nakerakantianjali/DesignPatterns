package com.company.FactoryPattern;

public class Android implements  OperatingSystem{
    @Override
    public void getversion() {
        System.out.println("version of Androiod is: 11.2");
    }

    @Override
    public void getSpecifications() {
        System.out.println("Specifications of Android");

    }
}
