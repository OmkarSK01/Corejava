package filehandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileHandlingDemo {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\dell\\IdeaProjects\\JavaBatch\\src\\filehandling\\FileHandlingDemo.javatest.txt");

        try{
           FileOutputStream fileOutputStream = new FileOutputStream(file);//("C:\\Users\\dell\\IdeaProjects\\JavaBatch\\src\\filehandling\\FileHandlingDemo.javatest.txt");
            String str = "Today is Wednesday";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);// arr ethe value taklya tr ascii code print honr
            System.out.println("File write successfully..");

        } catch (IOException e){
            e.printStackTrace();
        }

       try{
            FileInputStream fileInputStream = new FileInputStream(file);//("C:\\Users\\dell\\IdeaProjects\\JavaBatch\\src\\filehandling\\FileHandlingDemo.javatest.txt");
            int i = fileInputStream.read();
           while (i>0){
                System.out.print((char)i); //ln nka taku vertically print hota
                i = fileInputStream.read();

            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }


}
