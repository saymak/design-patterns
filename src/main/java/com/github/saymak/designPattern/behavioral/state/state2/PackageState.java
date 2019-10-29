package com.github.saymak.designPattern.behavioral.state.state2;

public interface PackageState {
    void next(PackageState pkg);

    void prev(PackageState pkg);

    void printStatus();
}
