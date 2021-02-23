package com.company.StructuralPattern.FacadePattern;


public class Samsung implements Mobile {
    @Override
    public String getName() {
        return "Samsung";
    }

    @Override
    public String getVersion() {
        return "version";
    }

    @Override
    public void Features() {
        System.out.println("Samsung features");

    }
}
