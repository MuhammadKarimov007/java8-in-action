package chapter5;

import domain.Dish;

import java.util.List;

public class NoneMatch {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();
        boolean isHealthy = menu.stream()
                .noneMatch(d -> d.calories() >= 1000);
        System.out.println(isHealthy);
    }
}
