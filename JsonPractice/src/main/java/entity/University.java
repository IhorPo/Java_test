package entity;

public class University {
    private String nameUniversity;
    private String faculty;
    private  String group;

    public University() {
    }

    public University(String nameUniversity, String faculty, String group) {
        this.nameUniversity = nameUniversity;
        this.faculty = faculty;
        this.group = group;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "University{" +
                "nameUniversity='" + nameUniversity + '\'' +
                ", faculty='" + faculty + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
