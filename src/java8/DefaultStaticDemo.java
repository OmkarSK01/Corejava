package java8;

interface MyInterface7 {
    static int sub(int a, int b) {
        return a - b;
    }

    String msg();

    default int add(int a, int b) {
        return a + b;
    }
}

interface MyInterface8 {

    default int add(int a, int b) {
        return a + b;
    }

    default int multi(int a, int b) {
        return a * b;
    }


}

public class DefaultStaticDemo implements MyInterface7, MyInterface8 {
    public static void main(String[] args) {
        DefaultStaticDemo obj = new DefaultStaticDemo();
        System.out.println(obj.add(3, 3));
        MyInterface7.sub(7, 5);
    }

    @Override
    public int add(int a, int b) {
        return MyInterface8.super.add(a, b);
    }

    @Override
    public String msg() {
       return null;
    }
}





/*interface MyInterface7 {
    static int add(int a, int b) {
        return a + b;
    }

    String msg();

    default int sub(int a, int b) {
        return a - b;
    }
}

interface MyInterface8 {

    default int add(int a, int b) {
        return a + b;
    }

    default int multi(int a, int b) {
        return a * b;
    }



}

public class DefaultStaticDemo implements MyInterface7, MyInterface8 {
    public static void main(String[] args) {
        DefaultStaticDemo obj = new DefaultStaticDemo();
        System.out.println(obj.sub(7, 5));
        MyInterface7.add(3, 3);
    }

    @Override                     //fkt sub la he ny dil tri op yeil= 7-5=2
    public int add(int a, int b) {
        return MyInterface8.super.add(a, b);
    }

    @Override
    public String msg() {
        return null;
    }
}*/