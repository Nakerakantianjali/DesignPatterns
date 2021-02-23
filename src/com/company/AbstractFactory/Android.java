package com.company.AbstractFactory;

public class Android implements OPeratingSystem{
    @Override
    public void getversion() {
        System.out.println("version of Androiod is: 11.2");
    }

    @Override
    public void getSpecifications() {
        System.out.println("Specifications of Android");

    }
}
