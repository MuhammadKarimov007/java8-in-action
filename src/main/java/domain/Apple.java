package domain;

import chapter2.ApplePredicate;
import chapter2.challenges.ApplePrinter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public record Apple(String name, Integer weight) {
    public static List<Apple> filterApples(List<Apple> inventory,
                                           ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void prettyPrintApple(List<Apple> inventory,
                                        ApplePrinter printer) {
        for (Apple apple : inventory) {
            printer.print(apple);
        }
    }

    public static List<Apple> produceAppleData() {
        return Arrays.asList(
                new Apple("red", 149),
                new Apple("red", 201),
                new Apple("red", 150),
                new Apple("yellow", 151),
                new Apple("red", 140),
                new Apple("green", 124),
                new Apple("green", 120),
                new Apple("yellow", 130),
                new Apple("red", 100),
                new Apple("green", 160),
                new Apple("yellow", 171)
        );
    }
}
