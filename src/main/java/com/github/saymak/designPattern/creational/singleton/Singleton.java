package com.github.saymak.designPattern.creational.singleton;


public class Singleton {
    /*
        1- create a private static instance of your class that will be return on demand
    */
    private static Singleton singleton = new Singleton();

    /*
        2- as we know we will private our constructor and can not create Singleton object with new keyword
        so we need a method to return or only created object of Singleton class classicaly named it getInstance();
    */
    public static Singleton getInstance() {
        return singleton;
    }

    /*
        3- as mentioned earlier we are going to prevent object instantiation via new keyword so we
        need a private constructor
    */
    private Singleton(){

    }

}
