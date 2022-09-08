package lamdasStreamAPI;

import java.util.function.BiFunction;
import java.util.function.Function;

public class InterFunction {
    public static void main(String[] args) {
        Function<Integer, String> f = i -> {
            if(i>0){
                return "Number greater than 0";
            } else if(i<0){
                return "Number lower than 0";
            } else {
                return "Number equals 0";
            }
        };
        System.out.println(f.apply(10));
        System.out.println(f.apply(0));
        System.out.println(f.apply(-10));

        // BiFunction<T,D,R> - taking 2 parameters return 1
        BiFunction<Integer,Integer, String> bi = (x, y) -> "result = " + (x+y);
        System.out.println(bi.apply(5,5));


    }
}
