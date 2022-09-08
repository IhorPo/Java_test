package comparatorAndComparable;

import java.util.Comparator;

public class ComparatorClass implements Comparator {

    public int id;
    public String name;

    public ComparatorClass(){

    }
    public ComparatorClass(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "id = "+id+"; name = "+name;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return ((ComparatorClass)o1).id - ((ComparatorClass)o2).id;
    }
}
