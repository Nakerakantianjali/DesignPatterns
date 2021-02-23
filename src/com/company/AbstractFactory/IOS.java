package com.company.AbstractFactory;

public class IOS implements OPeratingSystem{
    @Override
    public void getversion() {
        System.out.println("version of IOS is: 10");
    }

    @Override
    public void getSpecifications() {
        System.out.println("Specifications of IOS");

    }
}
