package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

/*
 * stream api-> it is sequence of object and have many methods ,
 *              we combine that method for produce desire result
 * types - > sequential and parallel(multithreading)
 *
 * operation-=>
 * terminal -> forEach(),reduce(),collect()
 * intermediate -> map(Function),filter(Predicate),sorted()
 *
 */
public class StreamApi {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,8,9);
        Function<Integer,Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        };

        Function<Integer,Boolean> function1 = (Integer integer)-> integer >10;
        System.out.println(function1.apply(40));

  //      list.stream().map(function).forEach(s->{
  //          System.out.println(s);
   //     });


        int max = 0;
        for(int i=0;i< list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
 //       System.out.println(max);


        System.out.println(IntStream.of(1,2,3,4,5,6,8,9).max().getAsInt());

    }
}