package chapter5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PythagoreanTriples {
    public static void main(String[] args) {
        Stream<double[]> pyTriples = IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 100)
                        .mapToObj(b -> new double[]{a, b, Math.sqrt(a*a + b*b)})
                        .filter(t -> t[2] % 1 == 0)
                );
        pyTriples.limit(5)
                .forEach(t ->
                        System.out.println((int)t[0] + ", " + (int)t[1] + ", " + (int)t[2]));
    }
}
