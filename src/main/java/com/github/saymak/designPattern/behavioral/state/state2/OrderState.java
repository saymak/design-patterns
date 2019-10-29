package com.github.saymak.designPattern.behavioral.state.state2;

public class OrderState implements PackageState {


    public void next(PackageState pkg) {
        pkg.next(new ProcessState());
    }

    public void prev(PackageState pkg) {
        System.out.println("0 > it's init state....");
    }

    public void printStatus() {
        System.out.println("1 > package ordered...");
    }
}
