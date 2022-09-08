package patterns.builder;

public interface Builder {

    void setName(String name);
    void setSurname(String surname);
    void setAge(int age);
    void setId(int id);
    void setHeight(int height);
    void setGender(Gender gender);
    Person result();
}
