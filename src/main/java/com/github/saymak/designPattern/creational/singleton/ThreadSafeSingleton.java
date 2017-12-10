package com.github.saymak.designPattern.creational.singleton;


public class ThreadSafeSingleton {
    private static ThreadSafeSingleton singleton = null;


    public static ThreadSafeSingleton getInstance() {

        if (singleton == null) {
            /*
                if we want to use a this class in multithreaded invironment we need to make it
                compatible for multi thread use, so we created as synchronized block to prevent race condition
                we also could use synchronized key world at method level but if do it in some other real long methods
                it migh cause real performance problems because all the lines of code usully not affected by multi threading
                and we should try to use only for specific lines that are really concerned by multi thread execution.

            */
            synchronized (ThreadSafeSingleton.class) {
                if (singleton == null) {
                    singleton = new ThreadSafeSingleton();
                }
            }

        }
        return singleton;
    }


    private ThreadSafeSingleton() {

    }

}
