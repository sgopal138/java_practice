package com.practice.corejava.thread;

class Table {

   synchronized void print(int num) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Thread1 extends Thread {

    Table t1;

    public Thread1(Table t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        t1.print(5);
    }

}

class Thread2 extends Thread {

    Table t1;

    public Thread2(Table t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        t1.print(10);
    }

}

class ThreadMain {
    public static void main(String[] args) {
        Table table = new Table();
        Thread1 t1 = new Thread1(table);
        Thread2 t2 = new Thread2(table);

        /*t1.setName("My Thread");
        System.out.println("Thread Name : " + t1.getName());

        t1.setDaemon(true);
        System.out.println("IsDaemon : " + t2.isDaemon());*/



        t1.start();
        /*try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        t2.start();
    }
}
