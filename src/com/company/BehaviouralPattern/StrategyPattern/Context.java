package com.company.BehaviouralPattern.StrategyPattern;

public class Context {
    public Context() {
    }

    Calculator calculator;

    public Context(Calculator calculator) {
        this.calculator = calculator;
    }

    public void execute(int num1, int num2){
        calculator.performOperation(num1,num2);
    }
}
