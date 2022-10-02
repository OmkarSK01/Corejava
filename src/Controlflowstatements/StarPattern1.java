package Controlflowstatements;

public class StarPattern1 {
    public static void main(String[] args) {

        int count = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print(" ");
            }
           for (int k = 1; k <= i; k++) {
                System.out.print(" " + count++);
            }
            System.out.println();
        }
        System.out.println();

    }
}


