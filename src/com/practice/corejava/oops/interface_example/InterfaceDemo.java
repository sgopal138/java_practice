package com.practice.corejava.oops.interface_example;

interface A{
    void display();
}

interface B{
    void display(String message);
}

class MultipleInterface implements A, B{

    @Override
    public void display() {
        System.out.println("Hello");
    }

    @Override
    public void display(String message) {
        System.out.println(message);
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {
        MultipleInterface multipleInterface = new MultipleInterface();
        multipleInterface.display();
        multipleInterface.display("Good day");
    }
}
