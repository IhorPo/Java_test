package patterns.builder;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int id;
    private int height;
    private Gender gender;

    public Person(String name, String surname, int age, int id, int height, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
        this.height = height;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public int getHeight() {
        return height;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", height=" + height +
                ", gender=" + gender +
                '}';
    }
}
