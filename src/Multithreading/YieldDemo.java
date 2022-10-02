package Multithreading;

public class YieldDemo extends Thread{
    @Override
    public void run() {
        Thread.yield();
        for (int i = 1; i < 5; i++) {
            System.out.println("In run method");
        }
    }

    public static void main(String[] args) {
        YieldDemo obj = new YieldDemo();
        obj.start();
        for (int i=1;i<5;i++){
            System.out.println("main method");
    }
        }
    }


