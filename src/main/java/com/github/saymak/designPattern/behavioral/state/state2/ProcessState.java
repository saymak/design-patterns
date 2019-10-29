package com.github.saymak.designPattern.behavioral.state.state2;

public class ProcessState implements PackageState {
    public void next(PackageState pkg) {
        PackagedState packagedState = new PackagedState();
        pkg.next(packagedState);
        packagedState.printStatus();
    }

    public void prev(PackageState pkg) {
        OrderState orderState = new OrderState();
        pkg.prev(orderState);
        orderState.printStatus();
    }


    public void printStatus() {
        System.out.println("order is processing...");
    }
}
