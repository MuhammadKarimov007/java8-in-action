package chapter2;

import domain.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        int heavyWeightInGrams = 150;
        return apple.weight() >= heavyWeightInGrams;
    }
}
