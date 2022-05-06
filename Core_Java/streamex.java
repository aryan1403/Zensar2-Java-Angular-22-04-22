package Core_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class streamex {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(21);
        list.add(0);
        list.add(99);

        // Print even (Sorted) -> 0, 10

        // 1st Method
        System.out.println("1)Even numbers :-");
        // Collections.sort(list);
        for (int e : list) {
            if(e % 2 == 0) {
                System.out.println(e);
            }
        }
        System.out.println("\n2)Even Numbers");
        // 2nd Method
        list.stream().filter(e -> (e % 2 == 0)).sorted()
            .collect(Collectors.toMap(e -> e+" Meow", Function.identity()))
            .forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
    }
}
