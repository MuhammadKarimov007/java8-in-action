package chapter5;

import domain.Dish;

import java.util.List;
import java.util.stream.Collectors;

public class FilterLimitStream {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();
        List<Dish> dishes = menu.stream()
                .filter(d -> d.calories() > 300)
                .limit(3)
                .toList();
        System.out.println(dishes);
    }
}
