package com.company.BehaviouralPattern.Memento;

public class OriginalState {
    private User state;

    public User getState() {
        return state;
    }

    public void setState(User state) {
        this.state = state;
    }

    public User saveToUser() {
        return state;
    }

    public void getStateFromUser(User user) {
         String fname= user .getfName();
         String lname=user.getlName();

    }
}
