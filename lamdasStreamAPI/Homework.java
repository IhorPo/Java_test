package lamdasStreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Homework {
    public static void main(String[] args) {
        List<Passport> people = new ArrayList<>(Arrays.asList(
                new Passport("Ihor", 22, 1111, "RS-11mp"),
                new Passport("Dan", 22, 2222, "RS-11mp"),
                new Passport("Jack", 23, 3333, "RA-11mp"),
                new Passport("John", 21, 4444, "RS-11mp")
        ));

        List<Passport> l1 = byGroup(people, a -> a.getGroup().equals("RS-11mp"));
        System.out.println(l1);

        List<Passport> l2 = byGroup(people, a -> a.getAge()>21);
        System.out.println(l2);
    }
    public static List<Passport> byGroup(List<Passport> list, Predicate<Passport> p){
        List<Passport> res = new ArrayList<>();
        for(Passport l: list){
            if(p.test(l)){
                res.add(l);
            }
        }

        return res;
    }
}

class Passport{
    private String name;
    private int age;
    private int id;
    private String group;

    public Passport(String name, int age, int id, String group) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", group='" + group + '\'' +
                '}';
    }
}