package lamdasStreamAPI.exmStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        // 1 Creating from existing collection
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3,2,4,1,2,4,5,6,7,9));
        numbers.stream().filter(x -> x<=4).forEach(System.out::println);

        // 2 Creating from values
        Stream.of(10,30,25,45,50).forEach(System.out::println);

        // 3 Creating from array
        String[] names = {"Dan", "Jack", "John", "Alex"};
        Arrays.stream(names).forEach(System.out::println);

        // 4 Creating from file (each line is an element of stream)
        try {
            Stream<String> streamFile = Files.lines(Paths.get("D:\\Java\\JavaTutorials\\src\\lamdasStreamAPI\\text.txt"));
            streamFile.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 5 Creating from map
        Map<Integer, Character> map = new HashMap<>();
        map.put(0, 'A');
        map.put(1, 'B');
        map.put(2, 'C');
        map.put(3, 'D');

        map.entrySet().stream().forEach(System.out::println);

        // Methods

        // filter
        List<Integer> li = new ArrayList<>(Arrays.asList(32,213,4,5,32,32,34,5,321,25));
        List<Integer> si = li.stream()
                .filter(x -> x>30)
                .collect(Collectors.toList());

        System.out.println(si);

        // Counting quantity of number 32
        System.out.println(li.stream().filter( li.get(0)::equals).count());

        // return first element or 0
        System.out.println(li.stream().findFirst().orElse(0));

        // return last element or 0
        System.out.println(li.stream().skip(li.size()-1).findAny().orElse(0));

        // getting list
        List<Integer> l = li.stream()
                .filter(x -> x>32)
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(l);

        // Getting list without duplicates
        List<Integer> noDuplicates = li.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("No duplicates\n"+noDuplicates);

        // Sorting comparators lambda
        List<Integer> sortedList = li.stream()
                .sorted((o1, o2) -> o2 - o1)
                .collect(Collectors.toList());

        System.out.println(sortedList);

        // map
        List<String> m = li.stream()
                .map(s -> s + "_1")
                .collect(Collectors.toList());
        System.out.println(m);

        //
        List<String> str = new ArrayList<>(Arrays.asList(
                "apple", "orange", "cat", "dog", "pig", "elephant", "apple", "cat"
        ));

        // sorting list + removing duplicates

        List<String> a = str.stream()
                .distinct()
                .sorted(((o1, o2) -> o1.toUpperCase().compareTo(o2.toUpperCase())))
                .collect(Collectors.toList());

        System.out.println(a);

    }
}