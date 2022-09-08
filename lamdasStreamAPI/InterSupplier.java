package lamdasStreamAPI;

import java.util.Locale;
import java.util.function.Supplier;

public class InterSupplier {
    public static void main(String[] args) {
        // Supplier     () -> T
        // Ничего не принимает, что-то возращает

        // return random number from 0 to 10, using Supplier<T>  () -> T

        Supplier<Integer> s = () -> (int) (Math.random() * 10);
        System.out.println(s.get());

        // to upper case using Supplier

        String name = "igor";
        Supplier<String> sName = () -> name.toUpperCase();

        System.out.println(sName.get());
    }
}
