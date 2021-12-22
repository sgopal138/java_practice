package com.practice.corejava.nestedclass;

public class LocalInnerCls {
    private int data = 30;

    void display(){
        class LocalInner{
            int value = 10;
            void show(){
                System.out.print("data : " + value);
            }
        }
        LocalInner l = new LocalInner();
        l.show();
    }

    public static void main(String[] args) {
        LocalInnerCls ls = new LocalInnerCls();
        ls.display();
    }
}
