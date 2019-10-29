package com.github.saymak.designPattern.behavioral.state.state2;

public class DeliveredState implements PackageState {
    public void next(PackageState pkg) {
        System.out.println("order processing is finished");
    }

    public void prev(PackageState pkg) {
        pkg.prev(new ShipState());
    }

    public void printStatus() {
        System.out.println("3> order delivered and finished....");
    }
}
