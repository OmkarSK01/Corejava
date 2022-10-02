package Controlflowstatements;

public class StudentDemo {
   int rollNo,TotalMarks;
    long contactNo;//int contactno pn chalta
    String name;

    public StudentDemo() {

            rollNo = 1;
            TotalMarks = 50;
            contactNo = 916884568;
            name = "omkar";
        }
        void show() {
            System.out.println("rollno=>" + 1);
            System.out.println("name=>" + "Omkar");
            System.out.println("contactNo=>" + 916);
            System.out.println("TotalMarks=>" + 50);
        }
        public static void main(String[] args) {
            StudentDemo obj = new StudentDemo();
            obj.show();
        }

        }
/*public class StudentDemo { //ya prog ne pn op yet
    int rollno,Totalmark;
    long contactno; //int contactno pn chalta
    String Name;
    public StudentDemo() {
        rollno = 5;
        Totalmark = 300;
        contactno = 916884568;
        Name = "Omkar";
    }
    void show(){
        System.out.println("roll no=>"+rollno);
        System.out.println("Total mark=>"+Totalmark);
        System.out.println("contact no=>"+contactno);
        System.out.println("Name=>"+Name);

    }
    public static void main(String[] args) {
        StudentDemo obj=new StudentDemo();
        obj.show();
    }
}*/







