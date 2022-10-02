package Multithreading;

public class MultiDemo1 {
    public static void main(String[] args) throws InterruptedException {

        Thread hii = new Thread(()-> {

            for (int i = 0; i < 5; i++) {
                System.out.println("Hii");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
     //  hii.start();

        Thread hello = new Thread(()-> {

            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        hii.start();
        hello.start();
        hii.join();
        hello.join();
        System.out.println("Bye");
    }
}
