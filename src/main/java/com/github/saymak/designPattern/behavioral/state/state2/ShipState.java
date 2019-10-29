package com.github.saymak.designPattern.behavioral.state.state2;

public class ShipState implements PackageState {
    public void next(PackageState pkg) {

    }

    public void prev(PackageState pkg) {
        pkg.prev(new ProcessState());
    }

    public void printStatus() {
        System.out.println("order is shipped....");
    }
}
