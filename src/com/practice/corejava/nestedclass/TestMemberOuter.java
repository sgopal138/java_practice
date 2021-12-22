package com.practice.corejava.nestedclass;

public class TestMemberOuter {

    private int data = 41;

    class InnerClass{
        public void display(){
            System.out.print("Data: " + data);
        }
    }

    public static void main(String[] args) {
        TestMemberOuter outer = new TestMemberOuter();
        InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
