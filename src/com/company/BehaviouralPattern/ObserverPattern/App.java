package com.company.BehaviouralPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class App {
    private List<Observer> observers = new ArrayList<Observer>();

    String features;

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
        notifyAllObservers();

    }
    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
