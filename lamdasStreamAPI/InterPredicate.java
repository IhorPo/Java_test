package lamdasStreamAPI;

import java.util.function.Predicate;

public class InterPredicate {
    public static void main(String[] args) {
        // if string not null return true
        Predicate<String> p = i -> !i.isEmpty();
        System.out.println(p.test(""));
        System.out.println(p.test("Igor"));

        System.out.println("\nand method:");
        // default method and - for comparing two predicates
        Predicate<String> p1 = i -> i.contains("A");
        Predicate<String> p2 = i -> i.contains("B");
        boolean res = p1.and(p2).test("ABCDE");
        System.out.println(res);

        // default method or - for comparing two predicates
        System.out.println("\nEx:");
        // checking if string starts with J or N and ends with A

        // 1 method
//        Predicate<String> t = i -> (i.startsWith("J")||
//                                    i.startsWith("N"))&&
//                                    i.endsWith("A");
        // 2 method
        Predicate<String> t1 = i -> i.startsWith("J");
        Predicate<String> t2 = i -> i.startsWith("N");
        Predicate<String> t3 = i -> i.endsWith("A");


        System.out.println(t1.or(t2).and(t3).test("Jack"));
        System.out.println(t1.or(t2).and(t3).test("NikolA"));
        System.out.println(t1.or(t2).and(t3).test("JonnA"));



    }
}
