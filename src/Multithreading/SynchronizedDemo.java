package Multithreading;

public class SynchronizedDemo {
    int num=0;
    private void increase(){

        num++;
    }

    public static void main(String[] args) throws InterruptedException {
     SynchronizedDemo   obj = new SynchronizedDemo();
     Thread t1 = new Thread(()->{
         for (int i=1;i<=1000;i++){
             obj.increase();
         }

     });
t1.start();
        Thread t2 = new Thread(()-> {
            for (int i = 1; i <= 1000; i++) {
                obj.increase();
            }
        });
     t2.start();

     t2.join();
     t2.join();
        System.out.println(obj.num);
    }
}
