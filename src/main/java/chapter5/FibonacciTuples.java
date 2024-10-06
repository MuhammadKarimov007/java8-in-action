package chapter5;

import java.util.stream.Stream;

public class FibonacciTuples {
    public static void main(String[] args) {
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(20)
                .forEach(t -> System.out.println(t[0] + ", " + t[1]));
    }
}
