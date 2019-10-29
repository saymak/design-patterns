package com.github.saymak.designPattern.behavioral.state.state2;

public class Package {
    private PackageState packageState = new OrderState();

    public PackageState getPackageState() {
        return packageState;
    }

    public void setPackageState(PackageState packageState) {
        this.packageState = packageState;
    }

    public void nextState() {
        packageState.next(packageState);
    }

    public void prevState() {
        packageState.prev(packageState);
    }
}
