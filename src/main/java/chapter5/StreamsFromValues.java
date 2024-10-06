package chapter5;

import java.util.stream.Stream;

public class StreamsFromValues {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java 8", "Lambdas", "In", "Action");
        stream.map(String::toUpperCase).forEach(System.out::println);

//        You can get an empty stream like this
        Stream<String> emptyStream = Stream.empty();
    }
}
