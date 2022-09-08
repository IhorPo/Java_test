package serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Dan", 20, "Yes", 234123);
        Person person2 = new Person("Bob", 16, "No", 234123);

        List<Person> personArray = new ArrayList<>(Arrays.asList(
                new Person("Dan", 20, "Yes",234234),
                new Person("Jack", 21, "Yes",543543),
                new Person("Bam", 16, "No",5465645)
        ));

        File file = new File("D:\\Java\\JavaTutorials\\src\\serialization\\file.txt");
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            // Saving objects into file - serialization
            oos.writeObject(person1);
            oos.writeObject(person2);
            // Array it's object
            oos.writeObject(personArray);

            // Reading objects from file - deserialization
            Person p1 = (Person)ois.readObject();
            System.out.println(p1);
            Person p2 = (Person)ois.readObject();
            System.out.println(p2);

            ArrayList<Person> pArray = (ArrayList<Person>) ois.readObject();
            System.out.println(pArray);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

class Person implements Serializable{
    private String name;
    private int age;
    private String education;
    // transient - field cannot be serializable
    private transient int password;

    public Person(String name, int age, String education, int password){
        this.name = name;
        this.age = age;
        this.education = education;
        this.password = password;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getEducation(){
        return education;
    }

    public int getPassword(){
        return password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", education='" + education + '\'' +
                ", password='" + password +
                '}';
    }
}