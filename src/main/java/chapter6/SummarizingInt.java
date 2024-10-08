package chapter6;

import domain.Dish;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingInt {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();
        IntSummaryStatistics menuStatistics = menu.stream()
                .collect(Collectors.summarizingInt(Dish::calories));
        System.out.println(menuStatistics);
    }
}
