package com.practice.corejava.designpattern;

public class SingletonUsingEnum {

    public static void main(String[] args) {
        MyEnum singleton = MyEnum.INSTANCE;
        System.out.println(singleton.hashCode());

		/*System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());*/

        MyEnum singleton1 = MyEnum.INSTANCE;
        System.out.println(singleton1.hashCode());

		/*System.out.println(singleton1.getValue());
		singleton1.setValue(3);
        System.out.println(singleton1.getValue());*/
    }
}
