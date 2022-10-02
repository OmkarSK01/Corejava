package controlflowstatements;

import java.util.Arrays;
import java.util.List;

public class ForLoopDemo {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 10;//0
        arr[1] = 11;//1
        arr[2] = 13;//2
        arr[3] = 14;//3
        arr[4] = 15;//4

        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //tradition for
        System.out.println();
        for(int i=  arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

        System.out.println();

        //enhanced for loop
        for (int i:arr) {
            System.out.println(i);
        }

        List<Integer> list = Arrays.asList(3,4,343,4);
        list.forEach(s->{
            System.out.println(s);
        });


    }
}