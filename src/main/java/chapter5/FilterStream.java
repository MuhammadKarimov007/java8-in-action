package chapter5;

import domain.Dish;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterStream {
    private List<Dish> menu = Dish.getDishes();
    List<Dish> vegetarianMenu = menu.stream()
            .filter(Dish::vegetarian)
            .collect(Collectors.toList());
}
