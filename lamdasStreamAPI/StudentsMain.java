package lamdasStreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StudentsMain {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(Arrays.asList(
                new Student("Igor", 22, 11),
                new Student("Dan", 19, 8),
                new Student("Jack", 20, 9),
                new Student("Will", 22, 11)
        ));

        List<Student> studentsByGroup = filt(studentList, i -> i.getGroup() == 11);
        List<Student> studentsByAge = filt(studentList, i -> i.getAge()>19);

        System.out.println(studentsByAge);
        System.out.println(studentsByGroup);

    }

    public static List<Student> filt(List<Student> list, Predicate<Student> p){
        List<Student> res = new ArrayList<>();
        for(Student l: list){
            if(p.test(l)){
                res.add(l);
            }
        }

        return res;
    }
}

class Student{
    private String name;
    private int age;
    private int group;

    public Student(String name, int age, int group){
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
    }
}