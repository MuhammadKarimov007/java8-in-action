package chapter7;

import java.util.stream.Stream;

public class BetterApproach {
    public static long sequentialSum(long n) {
        return Stream.iterate(1L, i -> i+1)
                .limit(n)
                .parallel()
                .reduce(0L, Long::sum);
    }
}
