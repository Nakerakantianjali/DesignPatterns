package com.company.StructuralPattern.ProxyPattern;

public class MobileCamera implements Camera {
    @Override
    public void takePicture() {
        System.out.println("take Picture");
    }
}
