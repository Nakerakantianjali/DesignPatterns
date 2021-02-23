package com.company.StructuralPattern.Decorative;

public class Oreo extends OperatingSystemDecorator{
    @Override
    public void getversion() {
    System.out.println("Version : 8.0");
    }

    @Override
    public void getSpecifications() {
    System.out.println("oreo Android Specifications");
    }

    @Override
    public void fingerPrint(String fingerPrint) {
    System.out.println("security Feactures:fingerPrint");
    }
}
