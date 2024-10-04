package chapter5;

import domain.Dish;

import java.util.List;
import java.util.Optional;

public class FindAny {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();
        Optional<Dish> dish = menu.stream()
                .filter(Dish::vegetarian)
                .findAny();
        dish.ifPresent(System.out::println);
    }
}
