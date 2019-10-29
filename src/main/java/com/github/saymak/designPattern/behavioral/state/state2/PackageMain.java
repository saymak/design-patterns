package com.github.saymak.designPattern.behavioral.state.state2;

public class PackageMain {
    public static void main(String[] args) {
        Package aPackage = new Package();
        aPackage.getPackageState().printStatus();
        Package aPackage1 = new Package();
        aPackage1.nextState();
        aPackage1.prevState();
        aPackage1.nextState();
        aPackage.nextState();
        aPackage.nextState();
        aPackage.nextState();

    }
}
