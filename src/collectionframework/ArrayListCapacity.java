package collectionframework;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ArrayListCapacity {
    public static void main(String[] args) throws Exception {

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(56);
        list1.add(33);
        list1.add(77);

        System.out.println(getCapacity(list1));

    }
    static int getCapacity(List al) throws Exception {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(al)).length;
    }
}
