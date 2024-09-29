package chapter2.challenges;

import domain.Apple;

public class AppleWeightPrinter implements ApplePrinter{
    @Override
    public void print(Apple apple) {
        System.out.println(apple.weight());
    }
}
