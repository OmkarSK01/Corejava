package Multithreading;

public class Deadlock {
    public static void main(String[] args) {
        String scanner= "Scanner";
        String printer= "Printer";
        Thread desktop = new Thread(()->{
            synchronized (scanner) {
                System.out.println(Thread.currentThread().getName() + "Locked" + scanner);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (printer) {
                    System.out.println(Thread.currentThread().getName() + "Locked" + printer);
                }
            }
            });
        Thread laptop = new Thread(()-> {
            synchronized (printer) {
                System.out.println(Thread.currentThread().getName() + "Locked" + printer);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (scanner) {
                    System.out.println(Thread.currentThread().getName() + "Locked" + scanner);
                }
            }
        });


        desktop.setName("Desktop");
        laptop.setName("Laptop");
        desktop.start();
        laptop.start();
    }
}
