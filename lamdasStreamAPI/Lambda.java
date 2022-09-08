package lamdasStreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {
    /*
    * Лямбда может быть использована только с функц. интерфейсами
    * Реализация:
    * 1) Создание своего интерфейса или использовать встроенные (Predicate, Consumer,Function...)
    * 2) Создание метода (Список обьектовб функц. интерфейс){
    *   проверка условия, если true - сохранение в список
    * }
    * 3) Используя метод (список, лямбда выражение с определенными условиями)
    * */
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>(Arrays.asList(
                new Car("BMW", 2000, 40),
                new Car("Lamba", 2010, 35),
                new Car("Dugatti", 2005, 30)
        ));

        List<Car> yearSorter = carSorter(cars, i -> i.year > 2000);
        List<Car> weightSorter = carSorter(cars, i -> i.weight < 40);

        System.out.println(yearSorter);
        System.out.println(weightSorter);
        
    }
    public static List<Car> carSorter (List<Car> list, Sorter<Car> s){
        List<Car> result = new ArrayList<>();

        for(Car car: list){
            if(s.test(car)){
                result.add(car);
            }
        }

        return result;
    }
}

@FunctionalInterface
interface Sorter <T>{
    boolean test(T item);
}

class Car{
    public String name;
    public int year;
    public int weight;

    public Car(String name, int year, int weight) {
        this.name = name;
        this.year = year;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                '}';
    }
}