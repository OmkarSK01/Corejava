package filehandling;

import java.io.*;

public class BufferOutputStreamDemo {
    public static void main(String[] args) {


        try {
            FileOutputStream fileOutputStream = new FileOutputStream("sample8.text");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String str = "Hello this is output stream demo ";
            byte [] arr = str.getBytes();
            bufferedOutputStream.write(arr);
            bufferedOutputStream.close();
            fileOutputStream.close();
            System.out.println("File write successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            FileInputStream fileInputStream = new FileInputStream("sample8.text");

            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
           // String str="Hello, read  successfully";
            int i = bufferedInputStream.read();
            while (i>0){
                System.out.print((char)i);
                i=bufferedInputStream.read();
            }
            bufferedInputStream.close();
            fileInputStream.close();

       } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
