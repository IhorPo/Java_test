package Parsers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.Student;

import java.io.*;

public class Parsers {
    // Jackson
    // Java object --> JSON
    public static void jackToJson(Student obj){
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("D:\\Java\\JsonPractice\\src\\main\\resources\\" +
                                "file1.json");
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(file, obj);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // JSON --> Java object

    public static void jackToJava(String path){
        ObjectMapper mapper = new ObjectMapper();
        try {
            Student val = mapper.readValue(new File(path), Student.class);
            System.out.println(val);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Gson
    // Java object --> JSON

    public static void gsonToJson(Student obj){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        File file = new File("D:\\Java\\JsonPractice\\src\\main\\resources\\" +
                            "file2.json");
        String val = gson.toJson(obj);
        try {
            FileWriter fw = new FileWriter(file);
            fw.write(val);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // JSON --> Java object
    public static void gsonToJava(String path){
        Gson gson = new Gson();
        try {
            FileReader fr = new FileReader(path);
            Student val = gson.fromJson(fr, Student.class);
            System.out.println(val);
            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


