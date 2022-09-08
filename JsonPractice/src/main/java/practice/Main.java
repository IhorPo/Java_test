package practice;

public class Main {
    public static void main(String[] args) {
        PracticeStudents ps1 = new PracticeStudents("Dan", 20, "BV");
        PracticeStudents ps2 = new PracticeStudents("John", 22, "TY");
        PracticeStudents ps3 = new PracticeStudents("Jack", 21, "RR");

        String[] s1 = {"AAB", "CDS", "VBD"};
        String[] s2 = {"RR", "BV","TY"};
        PracticeStudents[] s3 = {ps1, ps2, ps3};

        PracticeUniversity pu = new PracticeUniversity(
                "Shevchenko", s1, s2, s3
        );

        PracticeParsers p = new PracticeParsers();
        //p.jaJsJack(pu);
        //p.jsJaJack("D:\\Java\\JsonPractice\\src\\main\\resources\\university.json");

        //p.jsJaGson("D:\\Java\\JsonPractice\\src\\main\\resources\\university.json");
        //p.jaJsGson(pu);
    }
}
