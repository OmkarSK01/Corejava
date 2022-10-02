package superdemo;



/**
 * super ->
 * 1. it refers immediate parent class instance variable
 * 2. it refers immediate parent class methods.
 * 3. it refers immediate parent class constructor.
 */
public class SuperA {
    int i = 2;


    public void show(){
        System.out.println("In show super a");
    }

    public SuperA() {
        System.out.println("In super a constructor");
    }
    public SuperA(int i){
        System.out.println("In super a parameter constructor");
    }
}

class SuperB extends SuperA{
    int i = 4;

    public void show(){
        System.out.println("in show super b->"+super.i);
    }

    public SuperB(){
        super();
        System.out.println("In Super b constructor");
    }

    public SuperB(int i){
        super(5);
        System.out.println("In Super b parameter constructor");
    }

    public void display(){
        super.show();
    }

    public static void main(String[] args) {
        SuperB obj = new SuperB(7);
//        obj.display();
    }
}
