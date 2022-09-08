package lamdasStreamAPI;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReference {
    public static void main(String[] args) {
        Consumer<String> s1 = s -> System.out.println(s);
        s1.accept("Hello world");

        // Rewriting lambda expression with method reference
        Consumer<String> s2 = System.out::println;
        s2.accept("Hello WORLD");

        Predicate<Integer> p1 = x -> x>5;
        System.out.println(p1.test(10));
    }
}

