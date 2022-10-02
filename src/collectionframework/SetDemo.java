package collectionframework;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println(set);

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);

        System.out.println(set1);

        SortedSet<Integer> set2 = new TreeSet<>();
        set2.add(510);
        set2.add(250);
        set2.add(301);
        set2.add(54);
        set2.add(542);
        set2.add(541);

        System.out.println(set2.tailSet(301));
        System.out.println(set2.subSet(100,302));

    }
}