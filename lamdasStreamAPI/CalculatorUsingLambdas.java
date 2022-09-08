package lamdasStreamAPI;

import java.util.function.BiFunction;

public class CalculatorUsingLambdas {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> add = (x, y) -> x+y;
        BiFunction<Integer,Integer,Integer> derive = (x,y) -> x-y;
        BiFunction<Integer,Integer,Integer> divide = (x,y) -> x/y;
        BiFunction<Integer,Integer,Integer> multiply = (x,y) -> x*y;

        int resultAdd = add.apply(10,20);
        int resultDerive = derive.apply(10,20);
        int resultDivide = divide.apply(10,20);
        int resultMultiply = multiply.apply(10,20);

        System.out.println(resultAdd);
        System.out.println(resultDerive);
        System.out.println(resultDivide);
        System.out.println(resultMultiply);
    }
}
