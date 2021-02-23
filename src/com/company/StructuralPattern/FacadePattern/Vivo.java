package com.company.StructuralPattern.FacadePattern;

public class Vivo implements  Mobile{
    @Override
    public String getName() {
        return "Vivo";
    }

    @Override
    public String getVersion() {
        return "basic";
    }

    @Override
    public void Features() {
    System.out.println("Vivo features");
    }
}
