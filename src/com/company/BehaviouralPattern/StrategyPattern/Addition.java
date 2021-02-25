package com.company.BehaviouralPattern.StrategyPattern;

public class Addition implements Calculator{
    @Override
    public void performOperation(int a, int b) {
        int c=a+b;
        System.out.println("Addition:"+c);
    }
}
