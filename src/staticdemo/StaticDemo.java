package staticdemo;

public class StaticDemo {

    int id;
    String name;
    static String companyName = "ABC";
    public static void show(){
        System.out.println("In show");
    }

    public StaticDemo(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("id=>"+id+" name=>"+name+" company=>"+companyName);
    }

    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo(1,"Ravi");
        StaticDemo obj2 = new StaticDemo(2,"Akash");
        StaticDemo obj3 = new StaticDemo(3,"Suhas");
        StaticDemo.show();


    }
}