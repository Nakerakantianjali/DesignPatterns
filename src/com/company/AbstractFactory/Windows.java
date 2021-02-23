package com.company.AbstractFactory;

public class Windows implements OPeratingSystem{
    @Override
    public void getversion() {
        System.out.println("version of Windows is: 10");
    }

    @Override
    public void getSpecifications() {
        System.out.println("Specifications of windows");

    }
}
