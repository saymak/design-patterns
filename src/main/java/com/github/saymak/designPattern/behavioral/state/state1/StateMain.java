package com.github.saymak.designPattern.behavioral.state.state1;

public class StateMain {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.cook();
        robot.walk();
        robot.off();
        robot.walk();
        robot.cook();
        robot.off();
        robot.walk();
    }
}
