package com.company.BehaviouralPattern.Memento;

import java.util.ArrayList;
import java.util.List;

public class ListOfStates {
    private List<User> sateList = new ArrayList<User>();

    public void add(User state){
        sateList.add(state);
    }

    public User get(int index){
        return sateList.get(index);
    }

}