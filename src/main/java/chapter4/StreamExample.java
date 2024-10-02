package chapter4;

import domain.Dish;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
//        In this example, you first get a stream from the list of dishes
//        by calling the stream method on menu.
//        The data source is the list of dishes (the menu) and it provides
//        a sequence of elements to the stream.
//        Next, you apply a series of data processing operations on the stream.
//        All these operations except collect return another stream so they
//        can be connected to form a pipeline, which can be viewed as a query
//        on the source.
        final List<Dish> menu = Dish.getDishes();
        final List<String> threeHighCaloricDishNames = menu.stream()
                .filter(d -> d.calories() > 300)
                .map(Dish::name)
                .limit(3)
                .collect(Collectors.toList());
}
