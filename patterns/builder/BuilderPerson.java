package patterns.builder;

public class BuilderPerson implements Builder{
    private String name;
    private String surname;
    private int age;
    private int id;
    private int height;
    private Gender gender;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Person result(){
        return new Person(this.name, this.surname, this.age, this.id, this.height, this.gender);
    }
}
