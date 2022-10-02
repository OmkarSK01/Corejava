package stringdemo;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
      /*  char[] arr = {'w','e','l','l'};
      //  String str = new String(arr);

        String str1 = new String("red");//2
        String str2 = new String("green");//2
        String str3 = "red";//1
        String str4 = "yellow";//1
        String str5 = "green";//0
        String str6 = new String("yellow");//1
        String str7 = new String("red");//1 */


        String str = "Mumbai ";
        String str1 = "Mumbai";
        String str2 = "Pune";
        String str3 = "Mumbai";



   //  System.out.println(str);
    //   System.out.println(Arrays.toString(str.getBytes()));
  //      System.out.println(str.charAt(0));
  //      System.out.println(str.compareTo("Mumbai"));
 //      System.out.println(str.contains("p"));
 //      System.out.println(str.compareToIgnoreCase("MuMbaI"));;

 //  str = str.concat(" is capital of maha");
   //     System.out.println(str.subSequence(1,4));
  //     System.out.println(str.substring(3,5));
//       System.out.println(str);
        System.out.println(str.trim());
    //   System.out.println(str.indexOf("u"));
       System.out.println(str.isBlank());
        System.out.println(str.isEmpty());
    }
}
