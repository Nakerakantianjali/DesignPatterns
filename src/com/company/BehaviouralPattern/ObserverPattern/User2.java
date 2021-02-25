package com.company.BehaviouralPattern.ObserverPattern;

public class User2 extends Observer{
    public User2(App subject){
        this.subject=subject;
        this.subject.attach(this);

    }
    @Override
    public void update() {
        System.out.println("user2 :newFeatures Added");

    }
}
