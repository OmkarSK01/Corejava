package exceptionhandling;

public class StackOverFlowDemo {

    public void recursive(int i){
        System.out.println("i==>"+i);
        if(i == 0){
            System.out.println("i is zero");
        }else {
            recursive(i);
        }
    }

    public static void main(String[] args) {
        StackOverFlowDemo obj = new StackOverFlowDemo();
        obj.recursive(4);
    }
}

