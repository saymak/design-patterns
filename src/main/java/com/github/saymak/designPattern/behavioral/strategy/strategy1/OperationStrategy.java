package com.github.saymak.designPattern.behavioral.strategy.strategy1;

public class OperationStrategy {
    private Operation operation;

    public OperationStrategy(Operation operation) {
        this.operation = operation;
    }

    public void setStrategy(Operation operation) {
        this.operation = operation;
    }

    public int doOperation(int a, int b) {
        return operation.doOperation(a, b);
    }
}
