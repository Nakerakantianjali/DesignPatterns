package com.company.BehaviouralPattern.CommandPattern;

public class FingerPrint implements OperatingSystem{
    @Override
    public void authentication() {
        Authentication authentication = new Authentication();
        authentication.facelock();

    }
}
