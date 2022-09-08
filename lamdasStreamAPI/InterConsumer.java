package lamdasStreamAPI;

import java.util.Locale;
import java.util.function.Consumer;

public class InterConsumer {
    public static void main(String[] args) {
        Consumer<String> c1 = i -> System.out.println(i.toLowerCase());
        c1.accept("HELLO WORLD");

        Consumer<String> c2 = i -> System.out.println(i.toUpperCase());
        // andThen - executing c1 than c2
        c1.andThen(c2).accept("HeLlO WoRlD");



    }
}
