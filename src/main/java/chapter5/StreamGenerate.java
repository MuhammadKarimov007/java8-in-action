package chapter5;

import java.util.stream.Stream;

public class StreamGenerate {
    public static void main(String[] args) {
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }
}
