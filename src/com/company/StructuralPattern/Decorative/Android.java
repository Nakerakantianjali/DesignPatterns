package com.company.StructuralPattern.Decorative;

import com.company.FactoryPattern.OperatingSystem;

public class Android implements OPeratingSystem {
    @Override
    public void getversion() {
        System.out.println("version of Androiod is: 11.2");
    }

    @Override
    public void getSpecifications() {
        System.out.println("Specifications of Android");

    }
}
