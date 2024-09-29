package chapter2;

import domain.Apple;

import java.util.List;

public class SixthExample {
    List<Apple> appleData = Apple.produceAppleData();
    List<Apple> result = Apple.filterApples(appleData,
            (Apple apple) -> "red".equals(apple.name())
    );
}
