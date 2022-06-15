package JavaLearn.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {

        List<Integer> ls =  Arrays.asList(1,2,3,4,5);

        List<Integer> squareList = ls.stream().map(x -> x*x).collect(Collectors.toList());

        squareList.stream().forEach(x -> System.out.println(x));

        List<Integer> onlyEven = ls.stream().filter(x -> x%2==0 ).collect(Collectors.toList());

        onlyEven.stream().forEach(x -> System.out.println(x));

        int additionOfOdd = ls.stream().reduce(0,(acc,x) -> {
                if(x%2 == 1)
                    acc = acc + x;
                return acc;
                });

        System.out.println("additionOfOdd " + additionOfOdd);


        //----------------------------------------------------------------------------------


        List<List<Integer>> tmp = new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);

        List<Integer> b=new ArrayList<>();
        b.add(4);

        tmp.add(a);
        tmp.add(b);

        tmp.stream().forEach(x -> {
                    for (int d : x) {
                        System.out.println(d);
                    }
                    System.out.println();
                }
        );

        HashMap<Integer,List<Integer>> mp = new HashMap<>();
        mp.put(1,Arrays.asList(1));
        mp.put(2,Arrays.asList(1,2));
        mp.put(3,Arrays.asList(1,2,3));

        System.out.println(mp.get(3));

    }
}
