package Multithreading;

public class AnonymousInnerClass  {
    public static void main(String[] args) {
        interface Add {
            int addition(int a,int b);
        }


        Add add = new Add() {

            @Override
            public int addition(int a, int b) {

                return a+b;
            }
        };

        System.out.println(add.addition(3,3));
    }

}









/*interface Add { // ethpn gheu shkto pn vrtich ghya nehmi
    int addition(int a,int b);
}*/