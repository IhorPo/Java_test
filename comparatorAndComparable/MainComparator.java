package comparatorAndComparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainComparator {
    public static void main(String[] args) {
        ComparatorClass c1 = new ComparatorClass(1, "Dan");
        ComparatorClass c2 = new ComparatorClass(5, "Jack");
        ComparatorClass c3 = new ComparatorClass(3, "Anya");
        ComparatorClass c4 = new ComparatorClass(2, "Bob");
        ComparatorClass c5 = new ComparatorClass(6, "Billy");
        ComparatorClass c6 = new ComparatorClass(4, "John");

        ComparatorClass[] list = {c1,c2,c3,c4,c5,c6};

        System.out.println(Arrays.asList(list));
        //Arrays.sort(list, new ComparatorClass());
        // Sorting by id
        Arrays.sort(list, new ComparatorClass(){
            @Override
            public int compare(Object o1, Object o2){
                return ((ComparatorClass)o1).id - ((ComparatorClass)o2).id;
            }
        });
        //
        // Sorting by names by using Comparator
        Arrays.sort(list, new Comparator<ComparatorClass>(){
            @Override
            public int compare(ComparatorClass o1, ComparatorClass o2) {
                return ((ComparatorClass)o1).name.compareTo(((ComparatorClass)o2).name);
            }
        });
        System.out.println(Arrays.asList(list));
    }
}
