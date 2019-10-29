package com.github.saymak.designPattern.behavioral.state.state2;

public class PackagedState implements PackageState {

    public void next(PackageState pkg) {
        pkg.next(new ShipState());
    }

    public void prev(PackageState pkg) {
        pkg.prev(new OrderState());
    }

    public void printStatus() {
        System.out.println("3 order packaged for shipment....");
    }
}
