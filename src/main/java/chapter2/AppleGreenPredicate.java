package chapter2;

import domain.Apple;

public class AppleGreenPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.name().equalsIgnoreCase("green");
    }
}
