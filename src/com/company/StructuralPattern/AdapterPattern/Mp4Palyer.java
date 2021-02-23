package com.company.StructuralPattern.AdapterPattern;

public class Mp4Palyer implements AdvancedMediaPlayer{
    @Override
    public void vlcPlayer() {

    }

    @Override
    public void mp4Player() {
        System.out.println("MP$ player running");
    }
}
