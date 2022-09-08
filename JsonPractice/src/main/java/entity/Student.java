package entity;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private University university;
    private List<String> hobbies;

    public Student() {
    }

    public Student(String firstName, String lastName, int age, University university, List<String> hobbies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.university = university;
        this.hobbies = hobbies;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public University getUniversity() {
        return university;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", university=" + university +
                ", hobbies=" + hobbies +
                '}';
    }
}
