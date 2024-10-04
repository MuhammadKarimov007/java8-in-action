package chapter5;

import domain.Dish;

import java.util.Arrays;
import java.util.List;

public class Chapter5Challenges {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();
        // Challenge 1
        List<Dish> firstTwoMeatDishes = menu.stream()
                .filter(d -> !d.vegetarian())
                .limit(2)
                .toList();
        System.out.println(firstTwoMeatDishes);
        // Challenge 2
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNums = nums.stream()
                .map(num -> num*num)
                .toList();
        System.out.println(squaredNums);
        // Challenge 3
        List<Integer> num1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> num2 = Arrays.asList(3, 4);
        List<int[]> pairsOfNum1AndNum2 = num1.stream()
                .flatMap(numFirst -> num2.stream()
                        .map(numSecond -> new int[]{numFirst, numSecond}))
                .toList();
        pairsOfNum1AndNum2.forEach(
                arr -> System.out.println(Arrays.toString(arr)));
        // Challenge 4
        List<int[]> pairsOfNum1AndNum2DivisibleBy3 = num1.stream()
                .flatMap(i -> num2.stream()
                                .filter(j -> (j+i) % 3 == 0)
                                .map(j -> new int[]{i, j})
                )
                .toList();
        System.out.println("hello");
        pairsOfNum1AndNum2DivisibleBy3.forEach(
                arr -> System.out.println(Arrays.toString(arr)));
    }
}
