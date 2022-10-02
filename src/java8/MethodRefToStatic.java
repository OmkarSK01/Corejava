package java8;

public class MethodRefToStatic {
    public static void main(String[] args) {
        //method reference to static method
        Myinterface5 myinterface5=MethodRefToStatic::display;
        myinterface5.show();
    }
    static void display(){

        System.out.println("In display");
    }
}
interface Myinterface5{
    void show();
}

