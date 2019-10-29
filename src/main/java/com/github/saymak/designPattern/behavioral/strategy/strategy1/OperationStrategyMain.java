package com.github.saymak.designPattern.behavioral.strategy.strategy1;

public class OperationStrategyMain {
    public static void main(String[] args) {

        OperationStrategy operationStrategy = new OperationStrategy(new AddOperation());
        System.out.println(operationStrategy.doOperation(1, 2));
        operationStrategy.setStrategy(new SubtractOperation());
        System.out.println(operationStrategy.doOperation(5, 10));
        operationStrategy.setStrategy(new DivisionOperation());
        System.out.println(operationStrategy.doOperation(20, 4));
    }
}
