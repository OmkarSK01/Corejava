package Controlflowstatements;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a");
        a = scanner.nextInt();
        System.out.println("Enter value of b");
        b = scanner.nextInt();
        int c = a+b;
        System.out.println("addition is "+c);
    }
}