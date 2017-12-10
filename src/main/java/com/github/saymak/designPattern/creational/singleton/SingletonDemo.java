package com.github.saymak.designPattern.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        /*
            if you uncomment following code you will get compile error because Singleton doesn't have public constructor
            compile error msg : Singleton() has private access in com.github.saymak.designPattern.creational.singleton.Singleton
        */
        //Singleton singleton1 = new Singleton();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1);
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2);
        if(instance1 == instance2){
            System.out.println("instance1 equals to instance2: "+instance1 +"="+ instance2);
        }

    }
}
