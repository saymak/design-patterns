package com.github.saymak.designPattern.behavioral.state.state1;

public class RoboticOff implements RoboticState {
    private final Robot robot;

    public RoboticOff(Robot robot) {
        this.robot = robot;
    }

    public void walk() {
        robot.setState(robot.getRoboticOn());
        System.out.println("robot is walking.....");
    }

    public void cook() {
        System.out.println("can not cook while is off....");

    }

    public void off() {
        System.out.println("robot is already off...");
    }
}
