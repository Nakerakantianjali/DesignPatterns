package com.company.StructuralPattern.AdapterPattern;

public class MediaAdapter implements MedaiPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;
    public AdvancedMediaPlayer getMediaPlayer( String type){
        if(type.equals("vlc")){
            advancedMediaPlayer= new VlcPlayer();
            return  new VlcPlayer();
        }
        advancedMediaPlayer=new Mp4Palyer();
        return  new Mp4Palyer();

    }

    @Override
    public void play() {
    advancedMediaPlayer.mp4Player();
    }
}
