package chapter3;

import java.util.concurrent.Callable;
import java.util.function.Predicate;

public class TrickyExample {
    public Callable<String> fetch() {
        return () -> "Tricky example ;-)";
    }
}
