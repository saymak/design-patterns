package com.github.saymak.designPattern.creational.singleton;

public class ThreadSafeSingletonDemo {
    public static void main(String[] args) {

        ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
        System.out.println(instance1);
        ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();
        System.out.println(instance2);
        if(instance1 == instance2){
            System.out.println("instance1 equals to instance2: "+instance1 +"="+ instance2);
        }

    }
}
