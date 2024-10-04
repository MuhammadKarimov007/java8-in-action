package chapter5;

import domain.Dish;

import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();
        boolean isHealth = menu.stream()
                .allMatch(dish -> dish.calories() < 1000);
        System.out.println("The menu is " + (isHealth ? "healthy" : "not healthy"));
    }
}
