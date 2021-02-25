package com.company;

import com.company.AbstractFactory.MainFactory;
import com.company.AbstractFactory.OPeratingSystem;
import com.company.AbstractFactory.OPeratingSystemFactory;

import com.company.BehaviouralPattern.ChainResponsibility.ChainPattern;
import com.company.BehaviouralPattern.CommandPattern.DeviceAcess;
import com.company.BehaviouralPattern.CommandPattern.FaceLock;
import com.company.BehaviouralPattern.CommandPattern.FingerPrint;
import com.company.BehaviouralPattern.IteratorPattern.Contact;
import com.company.BehaviouralPattern.IteratorPattern.ContactRepository;
import com.company.BehaviouralPattern.IteratorPattern.Container;
import com.company.BehaviouralPattern.IteratorPattern.Iterator;
import com.company.BehaviouralPattern.MediatorPattern.User;
import com.company.BehaviouralPattern.Memento.ListOfStates;
import com.company.BehaviouralPattern.Memento.OriginalState;
import com.company.BehaviouralPattern.ObserverPattern.App;
import com.company.BehaviouralPattern.ObserverPattern.User1;
import com.company.BehaviouralPattern.ObserverPattern.User2;
import com.company.BehaviouralPattern.StatePattern.Authenticate;
import com.company.BehaviouralPattern.StatePattern.Context;
import com.company.BehaviouralPattern.StatePattern.Login;
import com.company.BehaviouralPattern.StrategyPattern.Addition;
import com.company.BehaviouralPattern.StrategyPattern.Calculator;
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
        admin.addContact(person1);


        //Decorative
        com.company.StructuralPattern.Decorative.OPeratingSystem oPeratingSystem3= new Oreo();
        oPeratingSystem3.getSpecifications();

        //FacadePattern
        ShoopKeeper shoopKeeper =new ShoopKeeper();
        shoopKeeper.getSamsungDetails();
        shoopKeeper.getVivoDetails();

        //FlyWeight
        com.company.StructuralPattern.FlyWeightPattern.OperatingSystem operatingSystem2 =OSFactory.getOPeratingSystem("Android");
      // System.out.println("**********"+operatingSystem2);
      operatingSystem2.getversion();
        //ProxyPattern
        Camera camera = new BeautyPlus();
        camera.takePicture();

        //BehaviouralPattern
        //Chain Of Responsibility
        com.company.BehaviouralPattern.ChainResponsibility.Message email= ChainPattern.getMessage();
        email.logMessage(0,"deposit was credited with amouth 20000");

        //CommandPattern
        DeviceAcess deviceAcess= new DeviceAcess();
        FingerPrint fingerPrint = new FingerPrint();
        deviceAcess.authenticationMethod(fingerPrint);
        FaceLock faceLock= new FaceLock();
        deviceAcess.authenticationMethod(faceLock);
        deviceAcess.checkCredentials();

        //IteratorPattern
        Container container = new ContactRepository();
        Iterator it = container.getIterator();
        while(it.hasNext()){
            Contact contact = (Contact) it.next();
            System.out.println(contact.getfName() +""+ contact.getLname());

        }
        //MediatorPattern
        User user = new User("Anjali","Madhavi");
        user.sendMessae();

        //Memento
        com.company.BehaviouralPattern.Memento.User user1 = new com.company.BehaviouralPattern.Memento.User("anjali","madhavi");
        OriginalState originalState = new OriginalState();
        originalState.setState(user1);
        ListOfStates listOfStates = new ListOfStates();
        listOfStates.add(originalState.saveToUser());

        //ObserverPattern
        App subject = new App();

        new User1(subject);
        new User2(subject);

        System.out.println("First state change");
        subject.setFeatures("New Features");

        //StatePattern
        Context context= new Context();
        Login login = new Login();
        login.doAction(context);
        //StrategyPattern
        Calculator addition =new Addition();
        com.company.BehaviouralPattern.StrategyPattern.Context context2= new com.company.BehaviouralPattern.StrategyPattern.Context(addition);
        context2.execute(19,3);

        //Template
        com.company.BehaviouralPattern.TemplatePattern.OPeratingSystem oPeratingSystem1= new com.company.BehaviouralPattern.TemplatePattern.Android();
        oPeratingSystem1.feautures();
    }
}
