package patterns.builder.homeworkSoup;

public class Main {
    public static void main(String[] args) {

        SoupBuilder builder = new SoupBuilder();
        Director director = new Director();

        director.Borsch(builder);

        Soup borsch = builder.result();

        System.out.println(borsch);

    }
}
