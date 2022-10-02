package Controlflowstatements;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        int i;
        double count = 0;
        double Current_balance = 0;
        double Saving_balance = 0;
        char ch, account = '1';
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select Transaction");
            System.out.println("1. TO ADD MONEY");
            System.out.println("2. TO WITHDRAW MONEY");
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println("For which account you want to add");
                    System.out.println("1. Current Account");
                    System.out.println("2. Saving Account");
                    account = scanner.next().charAt(0);
                    if (account == '1') {
                        System.out.println("Enter amount want to add in Current Account");
                        count = scanner.nextDouble();
                        Current_balance = Current_balance + count;
                        System.out.println("Amount added successfully");
                        System.out.println("Current Balance :" + Current_balance);
                    } else {
                        System.out.println("Enter amount want to add in Saving Account");
                        count = scanner.nextDouble();
                        Saving_balance = Saving_balance + count;
                        System.out.println("Amount added successfully");
                        System.out.println("Saving Balance :" + Saving_balance);
                    }
                    break;
                case 2:
                    System.out.println("For which account you want to withdraw money");
                    System.out.println("1. Current Account");
                    System.out.println("2. Saving Account");
                    account = scanner.next().charAt(0);
                    if (account == '1') {
                        System.out.println("Enter amount want to withdraw from Current Account");
                        count = scanner.nextDouble();
                        if (Current_balance == 0) {
                            System.out.println("Insufficient Balance you can't withdraw");
                        } else {
                            Current_balance = Current_balance - count;
                            System.out.println("Amount withdraw successfully");
                            System.out.println(" Remaining Current Balance :" + Current_balance);
                        }
                    } else {
                        System.out.println("Enter amount want to withdraw from Saving Account");
                        count = scanner.nextDouble();
                        if (Saving_balance == 0) {
                            System.out.println("Insufficient Balance you can't withdraw");
                        } else {
                            Saving_balance = Saving_balance - count;
                            System.out.println("Amount withdraw successfully");
                            System.out.println(" Remaining Saving Balance :" + Saving_balance);
                        }
                    }
                    break;
                default:
                    System.out.println("No match found");
            }
            System.out.println();
            System.out.println("Total Current Account Balance :" + Current_balance);
            System.out.println("Total Saving Account Balance :" + Saving_balance);
            System.out.println();
            System.out.println("Do you want to continue(Y/N)");
            ch = scanner.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}


