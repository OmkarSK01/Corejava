package constructor;

/**
 * Constructor -> Constructor is special type of function which invoke/call automatically
 * when object of class is created.
 *
 * Rules->  1. your class name and constructor name should be same.
 *          2. constructor has no return type.
 *          3. static,final,synchronized keywords are not allowed.
 *
 * Types -> 1. Default constructor
 *          2. parameter constructor
 *
 * use => to initiate variable to their default value
 */

public class ConstructorDemo {

    int j;
    char c;

    public ConstructorDemo() {
        System.out.println("In constructor");
    }

    //this is constructor overloading
    public ConstructorDemo(int i) {
        System.out.println(this.c);
        System.out.println("In parameter constructor"+i);
    }

    public ConstructorDemo(int i, int j) {
        System.out.println("In parameter constructor");
    }

    static final synchronized  void showDisplay() {

    }

    public static void main(String[] args) {

        ConstructorDemo obj = new ConstructorDemo();

        ConstructorDemo obj1 = new ConstructorDemo(1);

    }
}
