package collections;

import java.util.*;

public class MapsEx {
    public static void main(String[] args) {
        /*
        * HashMap
        * В основе лежит массив, элементы являются linkedList
        * Если при добавлении элементов hashCode совпадают, происходит коллизия
        * Коллизия - элементы с одинаковым hashCode записываються в одну ячейку linkedList
        * Когда размер linkedList в одной ячейке достигает 8,
        * linkedList перестраивается в красно-черное дерево
        * */
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1,"A");
        map1.put(2,"B");
        // put if there is no such element
        map1.putIfAbsent(2, "B");
        // putting already existing key will rewrite element
        map1.put(1, "Aa");
        // value can be already exist
        map1.put(3, "A");

        System.out.println(map1);
        // getting value by key
        System.out.println(map1.get(3));
        // return boolean value if key/value exist in current map
        System.out.println(map1.containsKey(2));
        System.out.println(map1.containsValue("B"));
        // Getting set of key
        Set<Integer> setOfKey = map1.keySet();
        System.out.println(setOfKey);
        // Getting collection of values
        Collection<String> setOfValues = map1.values();
        System.out.println(setOfValues);

        /*
        * TreeMap
        * Все значения отсортированы по возростанию (по ключу)
        * Работает быстро, но не быстрее HashMap
        * Используется для нахождения определенных отрезков (по ключам)
        * */
        System.out.println("---------------");
        System.out.println("TreeMap");
        System.out.println("---------------");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Dan");
        treeMap.put(8, "Max");
        treeMap.put(6, "Bob");
        treeMap.put(4, "Ban");
        treeMap.put(3, "Denis");
        treeMap.put(2, "Jack");

        System.out.println(treeMap);
        // Return elements with key less than 5
        System.out.println(treeMap.headMap(5));
        // Return elements with key more than 4
        System.out.println(treeMap.tailMap(4));

        // Situation when our key is an object
        Student st1 = new Student("Igor", "Ponomarenko");
        Student st2 = new Student("Jack", "Sparrow");
        Student st3 = new Student("Ben", "Jenkins");
        Student st4 = new Student("Max", "Luter");
        Student st5 = new Student("Piter", "Pen");

        // Sorting by objects name
        TreeMap<Student, Integer> tr = new TreeMap<>(new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return ((Student)o1).name.compareTo(((Student)o2).name);
            }
        });
        tr.put(st1, 4);
        tr.put(st2, 4);
        tr.put(st3, 4);
        tr.put(st4, 4);
        tr.put(st5, 4);

        System.out.println(tr);

        // LinkendHashMap
        // Сохраняет порядок вставки элементов
        // Можно сохранять по частоте использования последний использованый элемент
        // будет последним в map
    }
}

class Student{
    public String name;
    public String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}