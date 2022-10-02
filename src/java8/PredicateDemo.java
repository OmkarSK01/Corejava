package java8;


        import java.util.Arrays;
        import java.util.List;
        import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,8,9);

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>3;
            }
        };
        Predicate<Integer> predicate1 = p-> p<6;


        Predicate<Integer> checkInteger = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer ==10;
            }
        };
        Integer integer = 10;
        System.out.println(checkInteger.test(integer));

        list.stream().filter(predicate.and(predicate1)).forEach(System.out::println);
    }
}