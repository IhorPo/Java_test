package lamdasStreamAPI.exmStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeopleStream {
    public static void main(String[] args) {

        List<People> people = new ArrayList<>(Arrays.asList(
                new People("Dan", 18),
                new People("Elizabet", 16),
                new People("John", 17),
                new People("Ben", 19),
                new People("Piter", 20),
                new People("Carl", 21),
                new People("Liza", 17),
                new People("Jack", 19)
        ));

        // Creating stream API for getting people who 18 or more years old

        List<People> mature = people.stream()
                .filter(x -> x.getAge() >= 18)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(mature);

        // Transforming into another data type(From People -> Name)
        List<Name> names = people.stream()
                .map(p -> new Name(p.getName()))
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
