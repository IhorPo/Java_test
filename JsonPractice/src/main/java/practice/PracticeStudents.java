package practice;

public class PracticeStudents {
    public String name;
    public int age;
    public String group;

    public PracticeStudents() {
    }

    public PracticeStudents(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    @Override
    public String toString() {
        return "PracticeStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
    }
}
