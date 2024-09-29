package chapter2.challenges;

import domain.Apple;

public class AppleNameIsHeavyPrinter implements ApplePrinter{
    @Override
    public void print(Apple apple) {
        int weightLimit = 150;
        String heavyOrLight = apple.weight() >= weightLimit ? "heavy" : "light";
        System.out.println(apple.name() + " is " + heavyOrLight);
    }
}
