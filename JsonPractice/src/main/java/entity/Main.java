package entity;

import Parsers.Parsers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> hobbies = new ArrayList<>(Arrays.asList("Football", "Gym"));
        University university = new University("KPI", "RTF","RS-11mp");
        Student student = new Student("Dan", "Jhonson",30,university,hobbies);

        String path = "D:\\Java\\JsonPractice\\src\\main\\resources\\student.json";
        Parsers.jackToJson(student);
        Parsers.jackToJava(path);

        String path2 = "D:\\Java\\JsonPractice\\src\\main\\resources\\file2.json";
        Parsers.gsonToJson(student);
        Parsers.gsonToJava(path2);

    }
}
