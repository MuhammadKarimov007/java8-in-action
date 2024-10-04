package chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapStream {
    public static void main(String[] args) {
//        The problem with this approach is that the lambda passed
//        to the map method returns a String[] for each word.
//        So the stream returned by the map method is actually of
//        type Stream<String[]>.
//        What you want is Stream<String> to represent a stream
//        of characters.
        List<String> words = Arrays.asList("Hello", "World");
        List<String[]> uniqueChars = words.stream()
                .map(w -> w.split(""))
                .distinct()
                .toList();
        uniqueChars.forEach(arr ->
                System.out.println(Arrays.toString(arr))
        );
//        You need a stream of characters instead of a stream of arrays.
//        There's a method called Arrays.stream() that takes an array and
//        produces a stream
        String[] arrayOfWords = {"Goodbye", "World"};
        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
        List<Stream<String>> uniqueChars2 = words.stream()
                .map(word -> word.split(""))
                .map(Arrays::stream)
                .distinct()
                .toList();
//        The above solution still doesn't work. This is because you now
//        end up with a Stream<Stream<String>>
        List<String> uniqueChars3 = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .toList();
//        Using the flatMap method has the effect of mapping each array
//        not with a stream but with the contents of that stream.
//        All the separate streams that were generated when using
//        map(Arrays::stream) get flattened into a single stream.
    }
}
