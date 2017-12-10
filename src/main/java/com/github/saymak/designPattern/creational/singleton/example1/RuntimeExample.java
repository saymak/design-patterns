package com.github.saymak.designPattern.creational.singleton.example1;
/*
    one of the example1 and use case of singleton pattern is Runtime
    by the execution of this code you can see that Runtime class only accessible through
    .getRuntime() method and when calling it twice you can see both are pointing to same object
    and equals
 */
public class RuntimeExample {
    public static void main(String[] args) {
        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();
        Runtime anotherRuntime = Runtime.getRuntime();
        if(singletonRuntime == anotherRuntime){
            System.out.println("they are same:"+ singletonRuntime +"="+anotherRuntime);
        }
    }
}
