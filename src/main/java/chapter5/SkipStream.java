package chapter5;

import domain.Dish;

import java.util.List;

public class SkipStream {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();
        List<Dish> dishes = menu.stream()
                .filter(d -> d.calories() > 300)
                .skip(2)
                .toList();
        System.out.println(dishes);
    }
}
