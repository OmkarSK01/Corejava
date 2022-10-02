package exceptionhandling;

public class ExceptionDemo {

    public static void main(String[] args) {

        int i = 2;
        int j = 0;

        try {
            int k = i / j; //critical statement
            System.out.println(k);
        } catch (Exception e ) {
            System.out.println(e.getMessage());;
        }

        System.out.println("Hii");//normal statement
        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");

    }
}
