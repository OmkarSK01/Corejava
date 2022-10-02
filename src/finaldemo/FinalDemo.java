package finaldemo;

import staticdemo.StaticDemo;

/**
 * final keyword ->
 *  1. final variable - you can not reassign value to variable.
 *  2. final methods -  you can not override the method in child class.
 *  3. final class -  you can not inherit the class.
 *
 */
public final class FinalDemo {

    final int i ;//constant

    final String direction1 = "SOUTH";
    final Float pi = 3.142f;

    public FinalDemo() {
        i = 9;

    }

    public final void show(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.show();
        StaticDemo.show();


    }

}

/*
class Final2Demo extends FinalDemo{
    public void show(){
    }
    public static void main(String[] args) {
    }
}
*/