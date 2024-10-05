package chapter5;

import domain.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceStream {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int sumOfNumbers = Arrays.stream(numbers)
                .reduce(0, (a, b) -> a+b);
        System.out.println(sumOfNumbers);

//        The same code but with sum method reference
        int sumOfNumbers2 = Arrays.stream(numbers)
                .reduce(0, Integer::sum);
        System.out.println(sumOfNumbers2);

//        You could modify the above code to multiply numbers
        int productOfNumbers = Arrays.stream(numbers)
                .reduce(1, (a, b) -> a * b);
        System.out.println(productOfNumbers);

//      Here is the code to calculate the max calories in the menu
        List<Dish> menu = Dish.getDishes();
        int maxCal = menu.stream()
                .map(Dish::calories)
                .reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("Max calories: " + maxCal);

//        Here is the code to calculate the min calories in the menu
        Optional<Integer> minCal = menu.stream()
                .map(Dish::calories)
                .reduce(Integer::min);
    }
}
