package interfacedemo;

public class Calculator implements Operation,Operation2 {

    @Override
    public void add(int i, int j) {
        System.out.println(i + j);
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.add(6,7);
        obj.add(8,8,4);

    }

    @Override
    public void add(int i, int j,int k) {

    }
}
