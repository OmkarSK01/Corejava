package controlflowstatements;

public class IfElseDemo {
    public static void main(String[] args) {

        int age = 19;
        String nationality ="Pak";

        //nested if
        if(age>=18){
            if(nationality=="Indian"){
                System.out.println("You can vote");
            }else {
                System.out.println("Not indian");
            }
        }else {
            System.out.println("you can not vote");
        }

        int a = 3310, b=203, c = 30,d = 869;
        //ladder if
        if(a>b && a>c && a>d){
            System.out.println("A is greater");
        }else if(b>c & b>d){
            System.out.println("B is greater");
        }else if(c>d){
            System.out.println("c is greater");
        }else {
            System.out.println("d is greater");
        }

        int i = 10;
//
//        if(i>=100){
//            System.out.println("i is greater than 100");
//        }else {
//            System.out.println("i is less than 100");
//        }

        String str = i>=100?"i is greater than 100":"i is less than 100";

        System.out.println(str);

    }
}
