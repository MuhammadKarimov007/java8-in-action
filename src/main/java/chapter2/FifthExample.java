package chapter2;


import domain.Apple;

import java.util.List;

public class FifthExample {
    List<Apple> appleData = Apple.produceAppleData();
    List<Apple> redApples = Apple.filterApples(appleData, new ApplePredicate() {
        @Override
        public boolean test(Apple apple) {
            return "red".equals(apple.name());
        }
    });
}
