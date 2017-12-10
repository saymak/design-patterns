package com.github.saymak.designPattern.creational.singleton;


public class LazySingleton {
    /*
        1- to enhance the object creation performance we can change the object creation phase from eager to lazy
        to do this we only define our private static object reference to null

    */
    private static LazySingleton singleton = null;

    /*
        2- to create object in lazy mode, in getInstance() method we first check if our object reference is null
        we instantiate an object from our class and assign it object reference then return it
    */
    public static LazySingleton getInstance() {
        if(singleton==null){
            singleton = new LazySingleton();
        }
        return singleton;
    }


    private LazySingleton(){

    }

}
