package Controlflowstatements;

public class EvenOdd{ //array example
    public static void main(String args[]){
        int arr[]={10,200,555,67,35,2};       // prog mdhe arr chyaethe fkt a pn chalel
        System.out.println("Odd Numbers:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){                 //!-not operator
                System.out.println(arr[i]);
            }
        }
        System.out.println("Even Numbers:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
