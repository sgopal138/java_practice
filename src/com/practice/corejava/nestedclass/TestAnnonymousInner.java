package com.practice.corejava.nestedclass;

abstract class Person {
    abstract void eat();
}

public class TestAnnonymousInner {

    public static void main(String[] args) {

        Person p = new Person() {
            @Override
            void eat() {
                System.out.print("Eating");
            }
        };
        p.eat();
    }
}
