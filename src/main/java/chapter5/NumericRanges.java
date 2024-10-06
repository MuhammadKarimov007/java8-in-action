package chapter5;

import java.util.stream.IntStream;

public class NumericRanges {
    public static void main(String[] args) {
        IntStream evenNumbers = IntStream.rangeClosed(1, 100)
                .filter(i -> i % 2 == 0);
        evenNumbers.forEach(System.out::println);
    }
}
