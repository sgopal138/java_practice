package com.practice.corejava.oops.interface_example;


public class DefaultInterfaceExample implements DefaultInterface {

    @Override
    public void display() {
        System.out.println("Display printed");
    }

    public static void main(String[] args) {
        DefaultInterfaceExample defaultInterfaceExample = new DefaultInterfaceExample();
        defaultInterfaceExample.display();
        defaultInterfaceExample.sayHello();
    }
}
