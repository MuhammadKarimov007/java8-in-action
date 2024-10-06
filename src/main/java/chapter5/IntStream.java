package chapter5;

import domain.Dish;

import java.util.List;
import java.util.OptionalInt;

public class IntStream {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();
        int calories = menu.stream()
                .mapToInt(Dish::calories)
                .sum();
        System.out.println(calories);

        OptionalInt max = menu.stream()
                .mapToInt(Dish::calories)
                .max();
        max.ifPresent(System.out::println);
    }
}
