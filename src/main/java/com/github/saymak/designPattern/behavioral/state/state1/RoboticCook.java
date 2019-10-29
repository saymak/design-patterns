package com.github.saymak.designPattern.behavioral.state.state1;

public class RoboticCook implements RoboticState {
    private final Robot robot;

    public RoboticCook(Robot robot) {
        this.robot = robot;
    }

    public void walk() {
        robot.setState(robot.getRoboticOn());
        System.out.println("robot is walking...");
    }

    public void cook() {
        System.out.println("robot is cooking...");
    }

    public void off() {
        System.out.println("can not switched off while cooking...");
    }
}
