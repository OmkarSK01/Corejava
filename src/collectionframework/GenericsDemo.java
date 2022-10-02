package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Pune");
        list.add("Mumbai");
        list.add("nashik");
        listed(list);

        List<?> list1 = Arrays.asList(1,2,3,4,'c',"t",9,9.99);
        listed(list1);
    }

    private static void listed(List<?> list){
        list.forEach(System.out::println);
    }
}
