package practice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class PracticeParsers {
    // Jackson
    // Json -> Java
    public static void jsJaJack(String p){
        ObjectMapper om = new ObjectMapper();
        try {
            PracticeUniversity pu = om.readValue(new File(p), PracticeUniversity.class);
            System.out.println(pu);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Java -> Json
    public static void jaJsJack(PracticeUniversity obj){
        ObjectMapper om = new ObjectMapper();
        File f = new File("D:\\Java\\JsonPractice\\src\\main\\resources\\practice.json");
        try{
            om.writerWithDefaultPrettyPrinter().writeValue(f, obj);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Gson
    // Json -> Java
    public static void jsJaGson(String p){
        Gson g = new Gson();
        try {
            PracticeUniversity pru = g.fromJson(new FileReader(p), PracticeUniversity.class);
            System.out.println(pru);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // Java -> Json
    public static void jaJsGson(PracticeUniversity obj){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String pur = gson.toJson(obj);
        File file = new File("D:\\Java\\JsonPractice\\src\\main\\resources\\practiceG.json");
        try {
            FileWriter fw = new FileWriter(file);
            fw.write(pur);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
