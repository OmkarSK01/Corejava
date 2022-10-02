package Controlflowstatements;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {

        int i,j;
        char operation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for i and j");
        i = scanner.nextInt();
        j = scanner.nextInt();
        System.out.println("Enter value for operation");
        operation = scanner.next().charAt(0);

        switch (operation){
            case '+':
                System.out.println(i+j);
                break;
            case '-':
                System.out.println(i-j);
                break;
            case '*':
                System.out.println(i*j);
                break;
            case '/':
                System.out.println(i/j);
                break;
        }
    }
}