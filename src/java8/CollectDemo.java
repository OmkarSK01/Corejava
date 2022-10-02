package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*public class CollectDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,8,9);
        Predicate<Integer> predicate1 = p-> p<6;
        Set<Integer> list1 = list.stream().filter(predicate1)
                .collect(Collectors.toSet());
        System.out.println(list1);

     //   List<Integer>list1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println((list1));


    }
}*/


public class CollectDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,2,2,3,44,75,16,48,89);

        Predicate<Integer> predicate1 = p-> p<6;

       /* Set<Integer> list1 = list.stream().filter(predicate1)
                .collect(Collectors.toSet()); Predicate<Integer> predicate1 = p-> p<6;
        System.out.println(list1);
    */

    Set<Integer>list1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toSet());//it's not working
        System.out.println(list1);

                }
                }

