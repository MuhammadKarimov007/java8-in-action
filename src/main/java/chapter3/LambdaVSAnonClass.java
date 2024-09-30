package chapter3;

import domain.Apple;

import java.util.Comparator;

public class LambdaVSAnonClass {
    Comparator<Apple> byWeight = new Comparator<Apple>() {
        @Override
        public int compare(Apple o1, Apple o2) {
            return o1.weight().compareTo(o2.weight());
        }
    };

    // This can further be made compact, but for the example's sake, we will keep it
    // like this.
    Comparator<Apple> byWeightLambda = (Apple a1, Apple a2) ->
                    a1.weight().compareTo(a2.weight()
            );
}
