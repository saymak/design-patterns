package com.github.saymak.designPattern.behavioral.state.state1;

public class RoboticOn implements RoboticState {
    private final Robot robot;

    public RoboticOn(Robot robot) {
        this.robot = robot;
    }

    public void walk() {
        System.out.println("robot is walking...");
    }

    public void cook() {
        System.out.println("robot is cooking...");
        robot.setState(robot.getRoboticCook());
    }

    public void off() {
        System.out.println("robot switching off...");
        robot.setState(robot.getRoboticOff());
    }
}
