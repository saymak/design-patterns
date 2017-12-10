package com.github.saymak.designPattern.creational.singleton;

public class LazySingletonDemo {
    public static void main(String[] args) {

        LazySingleton instance1 = LazySingleton.getInstance();
        System.out.println(instance1);
        LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println(instance2);
        if(instance1 == instance2){
            System.out.println("instance1 equals to instance2: "+instance1 +"="+ instance2);
        }

    }
}
