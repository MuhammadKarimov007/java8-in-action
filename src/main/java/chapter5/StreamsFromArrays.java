package chapter5;

import java.util.Arrays;

public class StreamsFromArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);

        String[] names = {"James", "Andrew", "Ann"};
        Arrays.stream(names)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
