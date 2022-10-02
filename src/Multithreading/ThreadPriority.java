package Multithreading;

import org.w3c.dom.ls.LSOutput;

public class ThreadPriority {
    public static void main(String[] args) {


        System.out.println(Thread.currentThread().getPriority());
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In t1 thread");

            }
        });
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In t2 thread");

            }
        });

        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
    }
}
