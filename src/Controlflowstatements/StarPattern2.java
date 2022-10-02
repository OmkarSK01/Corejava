package Controlflowstatements;

public class StarPattern2 {
    public static void main(String[] args) {
        int count1 = 16;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (count1 < 10) {
                    System.out.print(" 0" + count1--);
                } else System.out.print(" " + count1--);
            }
            System.out.println();
        }
    }
}