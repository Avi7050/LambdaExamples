package LambdaExamples;
import java.util.*;
import java.util.stream.Collectors;

public class FilterMethod {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,2,6,8);
        //Printing the Data
        numbers.stream().filter(i -> i % 2 == 0)
                        .forEach(number -> System.out.println(number));
        // List 
        List<Integer> evennumber = numbers.stream().filter(i -> i % 2 == 0)
                        .collect(Collectors.toList());
                        System.out.println(evennumber);
        // Set 
        Set<Integer> oddnumber = numbers.stream().filter(i -> i % 2 != 0)
                        .collect(Collectors.toSet());
                        System.out.println(oddnumber);

        // count the element
        long even = numbers.stream().filter(i -> i % 2 == 0).count();
        System.out.println(even);

        int num = numbers.stream().filter(i -> i%2==0).findFirst().get();
        System.out.println(num);

        int n = numbers.stream().filter(i -> i%2==0).skip(1).findFirst().get();
        System.out.println(n);

    }
}
