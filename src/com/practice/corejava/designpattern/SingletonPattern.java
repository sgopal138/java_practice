package com.practice.corejava.designpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonPattern {
    private static SingletonPattern newInstance = null;

    private SingletonPattern(){

    }

    public static SingletonPattern getInstance(){
        if(newInstance == null){
            newInstance = new SingletonPattern();
        }
        return newInstance;
    }

    public static void main(String[] args) {
        SingletonPattern singleton = getInstance();
        System.out.println(singleton.hashCode());

        SingletonPattern singleton1 = getInstance();
        System.out.println(singleton1.hashCode());

        SingletonPattern singleton2 = null;

        Constructor[] constructors = SingletonPattern.class.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            constructor.setAccessible(true);
            try {
                singleton2 = (SingletonPattern)constructor.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            break;
        }

        if(singleton2 != null){
            System.out.println(singleton2.hashCode());
        }
    }
}
