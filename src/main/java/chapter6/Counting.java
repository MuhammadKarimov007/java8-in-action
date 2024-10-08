package chapter6;

import domain.Dish;

import java.util.List;
import java.util.stream.Collectors;

public class Counting {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();
        long howManyDishes = menu.stream().collect(Collectors.counting());
        System.out.println(howManyDishes);

//        You can express the above code more directly like this:
        long howManyDishes2 = menu.stream().count();
        System.out.println(howManyDishes2);

//        But the counting collector can be useful when used in combination
//        with other collectors which we will demonstrate later.
    }
}
