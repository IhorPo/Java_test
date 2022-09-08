package lamdasStreamAPI.exmStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList(
                "Ihor", "Dan", "Jack", "John", "Alex", "Ban", "Bob","Zorro"
        ));
        //
        List<String> byAlphabet = names.stream()
                .sorted(((o1, o2) -> o1.compareTo(o2)))
                .collect(Collectors.toList());

        System.out.println(byAlphabet);

        //
        List<String> byLetters = names.stream()
                .filter(a -> a.length() >= 4)
                .collect(Collectors.toList());

        System.out.println(byLetters);
    }
}
