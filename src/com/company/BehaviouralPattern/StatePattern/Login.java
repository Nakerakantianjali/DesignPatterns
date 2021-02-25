package com.company.BehaviouralPattern.StatePattern;

public class Login implements Authenticate{
    @Override
    public void doAction(Context context) {
        System.out.println("Logging in");
        context.setState(this);

    }
    public void actionPerformed(){
        System.out.println("Login");
    }
}
