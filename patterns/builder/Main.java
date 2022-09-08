package patterns.builder;

public class Main {
    public static void main(String[] args) {

        BuilderPerson builder = new BuilderPerson();
        Director director = new Director();

        director.boy(builder);

        Person personBoy = builder.result();

        System.out.println(personBoy);

        builder.setHeight(10000000);
        personBoy = builder.result();

        System.out.println(personBoy);
    }
}
