package chapter6;

import domain.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxByMinBy {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();
        Comparator<Dish> dishCaloriesComparator =
                Comparator.comparingInt(Dish::calories);

        Optional<Dish> mostCalorieDish = menu.stream()
                .collect(Collectors.maxBy(dishCaloriesComparator));
        mostCalorieDish.ifPresent(System.out::println);

        int totalCalories = menu.stream().collect(Collectors.summingInt(Dish::calories));
        System.out.println(totalCalories);

    }
}
