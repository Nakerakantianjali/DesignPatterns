package com.company.BehaviouralPattern.ObserverPattern;

import javax.security.auth.Subject;

public class User1 extends Observer{

    public User1(App subject){
        this.subject=subject;
        this.subject.attach(this);

    }
    @Override
    public void update() {
        System.out.println("user1 :newFeatures Added");
    }
}
