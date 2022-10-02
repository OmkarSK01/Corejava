package filehandling;

import java.io.*;

public class BufferWriterDemo {
    public static void main(String[] args) {

        try{
            FileWriter fileWriter = new FileWriter("sample3.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("today is 23 march");
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            FileReader fileReader = new FileReader("sample4.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int i = bufferedReader.read();
            while (i>0){
                System.out.print((char)i);
                i = bufferedReader.read();
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}