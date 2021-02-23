package com.company.StructuralPattern.AdapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void vlcPlayer() {
        System.out.println("Vlc player running");
    }

    @Override
    public void mp4Player() {

    }
}
