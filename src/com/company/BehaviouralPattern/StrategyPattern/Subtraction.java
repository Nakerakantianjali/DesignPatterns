package com.company.BehaviouralPattern.StrategyPattern;

public class Subtraction implements Calculator{
    @Override
    public void performOperation(int a, int b) {
        int c=a-b;
        System.out.println("Subraction:"+c);

    }
}
