package com.company.BehaviouralPattern.StatePattern;

public class Logout implements Authenticate{
    @Override
    public void doAction(Context context) {
        System.out.println("Logging out");
        context.setState(this);

    }
    public void actionPerformed(){
        System.out.println("Logout");
    }
}
