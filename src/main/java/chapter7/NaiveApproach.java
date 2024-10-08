package chapter7;

import java.util.stream.Stream;

public class NaiveApproach {
    public static long sequentialSum(long n) {
        return Stream.iterate(1L, i -> i+1)
                .limit(n)
                .reduce(0L, Long::sum);
    }
}
