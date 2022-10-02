package staticdemo;

public class Outer {

    int i = 90;

    public void show(){
        System.out.println("In show");
    }

    private static class Inner{

        public Inner(){
        }
        int i = 12;
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.i);

    // Outer.Inner inner = outer.new Inner(); //for non static inner class
     //  System.out.println(inner.i);

       Outer.Inner inner = new Outer.Inner();//for static inner class
        System.out.println(inner.i);
    }
}