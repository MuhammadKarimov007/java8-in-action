package chapter2;

import domain.Apple;

import java.util.ArrayList;
import java.util.List;

public class SecondExample {
    public static List<Apple> filterApplesByWeight(List<Apple> inventory,
                                                   int weight) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if (apple.weight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }
}