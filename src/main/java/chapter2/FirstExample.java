package chapter2;

import domain.Apple;

import java.util.ArrayList;
import java.util.List;

public class FirstExample {
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.name().equals("green")) {
                result.add(apple);
            }
        }
        return result;
    }
}
