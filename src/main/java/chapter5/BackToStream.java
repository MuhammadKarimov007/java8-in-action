package chapter5;

import domain.Dish;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BackToStream {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();
        IntStream intStream = menu.stream()
                .mapToInt(Dish::calories);
        Stream<Integer> stream = intStream.boxed();
    }
}
