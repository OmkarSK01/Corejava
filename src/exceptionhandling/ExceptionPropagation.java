package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*public */class ExceptionPropogation {

    public void a(){
        int i =10/1;//unchecked exc can be propogated

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void b(){
        a();
    }

    public void c(){
        try {
            b();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        ExceptionPropogation obj = new ExceptionPropogation();
        obj.c();
    }
}