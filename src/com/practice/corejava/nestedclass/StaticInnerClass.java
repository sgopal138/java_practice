package com.practice.corejava.nestedclass;

class StaticInnerClass {

    static int data = 10;

    static class Inner {
        void display() {
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        Inner obj = new Inner();
        obj.display();
    }
}
