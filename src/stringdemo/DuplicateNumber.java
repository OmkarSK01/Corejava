package stringdemo;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    public static void main(String[] args) {

        int[] arr = {1,2,3,1,2,4,1,5,6,2,8};

        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    set.add(arr[i]);
                }
            }
        }
        System.out.println(set);
    }
}

