package java8;

/*
 * lambada exp-> is anonymous function
 *
 * ()->{ body }
 *
 * use - it take less code
 *       it implements functional interface
 *
 */
/*public class LambadaExpression {

    public void show(){

    }
    public static void main(String[] args) {

        MyInterface myInterface = ()-> {
            System.out.println("in add method");
        };

        myInterface.add();
    }
}

@FunctionalInterface
interface MyInterface{

    void add();
}*/


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*@FunctionalInterface
interface MyInterface {

    void add();
}

@FunctionalInterface
interface MyInterface2 {

    void sub(int i,int j);
}

@FunctionalInterface
interface MyInterface3 {
    String msg();
}




public class LambadaExpression {

    public static void main(String[] args) {

        MyInterface myInterface = () -> {
            System.out.println("in add method");
        };
        MyInterface2 myInterface2 = (i, j) -> System.out.println(i - j);
        myInterface.add();
        myInterface2.sub(4, 2);
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        Consumer<Integer> consumer = new Consumer<Integer>() {

            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        list.forEach(consumer);
        MyInterface3 myInterface3 = ()-> "Hello";
        System.out.println(myInterface3.msg());


    }


    }*/




public class LambadaExpression {

    public void show(){

    }
    public static void main(String[] args) {

        MyInterface myInterface = ()-> {
            System.out.println("in add method");
        };

        MyInterface2 myInterface2 = ( i, j) -> System.out.println(i-j);

        myInterface.add();
        myInterface2.sub(4,2);//sub-substraction

        List<Integer> list = Arrays.asList(1,2,3,4);

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        list.forEach(System.out::println);

        MyInterface3 myInterface3 = ()-> "Hello";

        System.out.println(myInterface3.msg());
    }
}

@FunctionalInterface
interface MyInterface{
    void add();

}
@FunctionalInterface
interface MyInterface2{
    void sub(int i,int j);
}

@FunctionalInterface
interface MyInterface3{
    String msg();
}




