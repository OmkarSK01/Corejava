package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorDemo {
    int id;
    String name;
    String address;

    public ComparatorDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ComparatorDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ComparatorDemo obj = new  ComparatorDemo(1, "Prakash", "Pune");
        ComparatorDemo obj2 = new ComparatorDemo(1, "Namrata", "Pune");
        ComparatorDemo obj3 = new ComparatorDemo(3, "Sagar", "Pune");

        List<ComparatorDemo> list1 = new ArrayList<>();
        list1.add(obj2);
        list1.add(obj3);
        list1.add(obj);


        Comparator<ComparatorDemo> comparator = ( o1, o2) ->{
            if(o1.id==o2.id){
                return 0;
            }else if(o1.id>o2.id){
                return 1;
            }else {
                return -1;
            }
        };

        Comparator<ComparatorDemo> comparator1 = ( o1, o2)-> {
            return o1.name.compareTo(o2.name);
        };

        Collections.sort(list1,comparator.thenComparing(comparator1));
        list1.forEach(s -> {
            System.out.println(s);
        });
    }
}




