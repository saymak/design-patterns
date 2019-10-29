package com.github.saymak.designPattern.behavioral.strategy.strategy1;

public class AddOperation implements Operation {
    public int doOperation(int a, int b) {
        return a + b;
    }
}
