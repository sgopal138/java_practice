package com.practice.corejava.oops.overriding;

class T1{
    int add(int a, int b){
        return a + b;
    }
}

class T2 extends T1{
    int add(int a, int b, int c){
        return a + b + c;
    }
}

public class OverloadingDemo {

    public static void main(String[] args) {
        T1 t = new T2();
        int result = t.add(1,2);

        System.out.print(result);
    }
}
