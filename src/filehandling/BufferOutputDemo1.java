package filehandling;

import java.io.*;

public class BufferOutputDemo1 {
    public static void main(String[] args) {
        try{
            FileOutputStream fileOutputStream1 = new FileOutputStream("sample5.txt");
            FileOutputStream fileOutputStream2 = new FileOutputStream("sample4.txt");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            byte[] arr = "today is 23 march".getBytes();

            byteArrayOutputStream.write(arr);
            byteArrayOutputStream.writeTo(fileOutputStream1);
            byteArrayOutputStream.writeTo(fileOutputStream2);

            byteArrayOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("sample3.txt");
            FileInputStream fileInputStream2 = new FileInputStream("sample4.txt");
            SequenceInputStream stream = new SequenceInputStream(fileInputStream,fileInputStream2);
            int i = stream.read();

            while (i > 0) {
                System.out.print((char) i);
                i = stream.read();
            }

            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

