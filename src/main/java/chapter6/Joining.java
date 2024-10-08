package chapter6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Joining {
    public static void main(String[] args) {
        String[] names = {"Andrew", "Adam", "Bob", "Cate"};
        String names1 = Arrays.stream(names)
                .collect(Collectors.joining());
        System.out.println(names1);

        String names2 = Arrays.stream(names)
                .collect(Collectors.joining(", "));
        System.out.println(names2);
    }
}
