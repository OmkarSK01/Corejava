package collectionframework;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);//head element index starts from-1

       // System.out.println(stack.peek());
      // System.out.println(stack.pop());

    //    System.o ut.println(stack.empty());
        System.out.println(stack.search(10));
        System.out.println(stack);
    }
}
//6april
     /*   StackDemo obj = new StackDemo();


   Stack<Integer> stack = new Stack<>();
        stack.add(10);
                stack.add(20);
                stack.add(30);
                stack.add(40);

 //       System.out.println(stack.peek());
//        System.out.println(stack.pop());
        System.out.println(stack.pop());
      //  System.out.println(stack.empty());
              //  System.out.println(stack.search(10));
                System.out.println(stack);
                }
                }*/

