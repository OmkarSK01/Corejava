package collectionframework;

import java.util.Vector;

public class VectorDemo {



//6april la zalta
public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(40);
        vector.add(40);
        vector.add(40);

        vector.remove(Integer.valueOf(40));
       vector.remove(5);
        vector.addElement(45);
    System.out.println( vector.lastElement());

       System.out.println(vector);
      System.out.println(vector.capacity());
        }
        }
