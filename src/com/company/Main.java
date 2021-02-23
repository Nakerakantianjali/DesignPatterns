package com.company;

import com.company.AbstractFactory.MainFactory;
import com.company.AbstractFactory.OPeratingSystem;
import com.company.AbstractFactory.OPeratingSystemFactory;

import com.company.FactoryPattern.OperatingSystem;
import com.company.Prototype.OPeratingSystemCache;
import com.company.Singleton.Android;
import com.company.StructuralPattern.AdapterPattern.MediaAdapter;
import com.company.StructuralPattern.BridgePattern.Email;
import com.company.StructuralPattern.BridgePattern.IMessage;
import com.company.StructuralPattern.BridgePattern.Message;
import com.company.StructuralPattern.CompositePattern.ContactList;
import com.company.StructuralPattern.Decorative.Oreo;
import com.company.StructuralPattern.FacadePattern.ShoopKeeper;
import com.company.StructuralPattern.FlyWeightPattern.OSFactory;
import com.company.StructuralPattern.ProxyPattern.BeautyPlus;
import com.company.StructuralPattern.ProxyPattern.Camera;

public class Main {

    public static void main(String[] args) {
        //Factory Pattern
        com.company.FactoryPattern.OPeratingSystemFactory factoryPattern = new com.company.FactoryPattern.OPeratingSystemFactory();
        OperatingSystem operatingSystem= factoryPattern.getOPeratingSystemType("Windows");
        operatingSystem.getSpecifications();
        operatingSystem.getversion();

        //AbstractFactorypattern
        OPeratingSystemFactory oPeratingSystemFactory= MainFactory.getFactory("Mobile");
        OPeratingSystem oPeratingSystem =oPeratingSystemFactory.getType("Android");
        oPeratingSystem.getSpecifications();
        oPeratingSystem.getversion();


	    // write your code here
        Android android= Android.getInstance();


        //prototype
        OPeratingSystemCache.setOSMap();
        com.company.Prototype.OperatingSystem operatingSystem1 = OPeratingSystemCache.OSMap.get("android");

        //structural Patterns

        //AdapterPattern
        MediaAdapter mediaAdapter = new MediaAdapter();
        mediaAdapter.getMediaPlayer("vlc");
        mediaAdapter.play();




        //BridgePattern
        Message Android = new com.company.StructuralPattern.BridgePattern.Android(new Email());
        Android.sendMessage("hello");
        //Composite Pattern
        ContactList admin = new ContactList("Anjali","Madhavi","98764321");
        ContactList person1 = new ContactList("person1","lname","987654321");
        admin.AddContact(person1);


        //Decorative
        com.company.StructuralPattern.Decorative.OPeratingSystem oPeratingSystem3= new Oreo();
        oPeratingSystem3.getSpecifications();

        //FacadePattern
        ShoopKeeper shoopKeeper =new ShoopKeeper();
        shoopKeeper.getSamsungDetails();
        shoopKeeper.getVivoDetails();

        //FlyWeight
        com.company.StructuralPattern.FlyWeightPattern.OperatingSystem operatingSystem2 =OSFactory.getOPeratingSystem("android");
        operatingSystem2.getSpecifications();
        operatingSystem2.getversion();
        //ProxyPattern
        Camera camera = new BeautyPlus();
        camera.takePicture();






    }
}
