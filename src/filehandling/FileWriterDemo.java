package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args)  {
        FileWriter fileWriter = null;
      //  character stream class
       try {
              fileWriter= new FileWriter("sample1.txt");
            fileWriter.write("Today is Thursday");
            System.out.println("file saved successfully...");
        } catch (IOException e) {
           e.printStackTrace();
       }
       finally {
            try {
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
      }


        try {
            FileReader fileReader = new FileReader("sample1.txt");
            int i = fileReader.read();
            while (i>0){
                System.out.print((char) i);
                i = fileReader.read();
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}



