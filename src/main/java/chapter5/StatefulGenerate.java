package chapter5;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class StatefulGenerate {
    public static void main(String[] args) {
        IntSupplier fib = new IntSupplier() {
            private int previous = 0;
            private int current = 1;
            @Override
            public int getAsInt() {
                int oldPrevious = this.previous;
                int nextValue = this.previous + this.current;
                this.previous = this.current;
                this.current = nextValue;
                return oldPrevious;
            }
        };
//        As the supplier fib maintains state, we should avoid using this stream
//        for parallel processing.
//        Otherwise, we may not get the results that we expect.
        IntStream.generate(fib).limit(10).forEach(System.out::println);
    }
}
