package com.company.BehaviouralPattern.StatePattern;

public class Context {
    private Authenticate state;
    public Context(){
        state=null;
    }
    public Authenticate getState() {
        return state;
    }

    public void setState(Authenticate state) {
        this.state = state;
    }


}
