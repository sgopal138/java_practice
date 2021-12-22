package com.practice.corejava.oops.interface_example;

public interface DefaultInterface {
    void display();
    default void sayHello(){
        System.out.println("Hello Suraj");
    }
}