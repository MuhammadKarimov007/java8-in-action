package chapter2;

import chapter2.challenges.AppleNameIsHeavyPrinter;
import chapter2.challenges.AppleWeightPrinter;
import domain.Apple;

import java.util.List;

public class Chapter2Main {
    public static void main(String[] args) {
        List<Apple> appleData = Apple.produceAppleData();
        Apple.prettyPrintApple(appleData, new AppleNameIsHeavyPrinter());

        Apple.prettyPrintApple(appleData, new AppleWeightPrinter());
    }
}
