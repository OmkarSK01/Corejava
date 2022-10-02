package controlflowstatements;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {

        int i = 10;

        int[] j = new int[5];
        j[0] = 10;
        j[1] = 11;
        j[2] = 13;
        j[3] = 14;
        j[4] = 15;

        List<Integer> list = new ArrayList<>();


        System.out.println(j[0]);

    }
}