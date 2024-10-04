package chapter5;

import domain.Dish;

import java.util.List;

public class AnyMatch {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();
        if (menu.stream().anyMatch(Dish::vegetarian)) {
            System.out.println("The menu is somewhat vegetarian friendly");
        }
    }
}
