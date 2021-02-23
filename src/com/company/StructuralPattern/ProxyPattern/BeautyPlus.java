package com.company.StructuralPattern.ProxyPattern;

public class BeautyPlus implements Camera{
    MobileCamera mobileCamera;
    public BeautyPlus(){
        mobileCamera = new MobileCamera();
    }
    @Override
    public void takePicture() {
        mobileCamera.takePicture();
    }

}
