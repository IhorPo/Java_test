package patterns.builder;

public class Director {
    public void boy(BuilderPerson builder){
        builder.setName("Dan");
        builder.setSurname("Johns");
        builder.setAge(10);
        builder.setId(1111);
        builder.setHeight(130);
        builder.setGender(Gender.MALE);
    }

    public void girl(BuilderPerson builder){
        builder.setName("Marry");
        builder.setSurname("Jane");
        builder.setAge(11);
        builder.setId(2222);
        builder.setHeight(140);
        builder.setGender(Gender.FEMALE);
    }
}
