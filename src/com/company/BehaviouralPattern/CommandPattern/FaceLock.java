package com.company.BehaviouralPattern.CommandPattern;

public class FaceLock implements OperatingSystem{
    @Override
    public void authentication() {
        Authentication authentication = new Authentication();
        authentication.facelock();
    }
}
