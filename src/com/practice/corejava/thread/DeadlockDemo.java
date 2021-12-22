package com.practice.corejava.thread;

public class DeadlockDemo {

    String s1 = "Suraj";
    String s2 = "Gopal";

    Thread t1 = new Thread(){
        @Override
        public void run() {
            while(true){
                synchronized (s1){
                    System.out.println(Thread.currentThread().getName() + " locked " + s1);
                    try{
//                        Thread.sleep(1000);
                        wait();
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    synchronized (s2){
                        System.out.println(Thread.currentThread().getName() + " locked " + s2);
                    }
                }
            }
        }
    };

    Thread t2 = new Thread(){
        @Override
        public void run() {
            while(true){
                synchronized (s2){
                    System.out.println(Thread.currentThread().getName() + " locked " + s2);

                    synchronized (s1){
                        System.out.println(Thread.currentThread().getName() + " locked " + s1);
                    }
                }
            }
        }
    };

    public static void main(String[] args) {
        DeadlockDemo d = new DeadlockDemo();
        d.t1.start();
        d.t2.start();
    }
}
