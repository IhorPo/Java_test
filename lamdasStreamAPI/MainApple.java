package lamdasStreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MainApple {
    public static void main(String[] args) {

        List<Apple> apples = new ArrayList<>(Arrays.asList(
                                            new Apple("green", 100),
                                            new Apple("green", 120),
                                            new Apple("red", 70),
                                            new Apple("yellow", 110)
        ));

        List<Apple> greenApples = filter(apples, (Apple a) -> "green".equals(a.color));
        System.out.println(greenApples);

        List<Apple> applesWeight = filter(apples, (Apple a) -> a.weight > 100);
        System.out.println(applesWeight);


    }
    public static List<Apple> filter(List<Apple> list, Predicate<Apple> p){
        List<Apple> result = new ArrayList<>();
        for(Apple item: list){
            if(p.test(item)){
                result.add(item);
            }
        }


        return result;
    }
}

class Apple{
    public String color;
    public int weight;

    public Apple(String color, int weight){
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}