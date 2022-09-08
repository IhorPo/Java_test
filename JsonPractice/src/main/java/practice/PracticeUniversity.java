package practice;

import java.util.Arrays;

public class PracticeUniversity {
    public String name;
    public String[] faculties;
    public String[] groups;
    public PracticeStudents[] students;

    public PracticeUniversity() {
    }

    public PracticeUniversity(String name, String[] faculties, String[] groups, PracticeStudents[] students) {
        this.name = name;
        this.faculties = faculties;
        this.groups = groups;
        this.students = students;
    }

    @Override
    public String toString() {
        return "PracticeUniversity{" +
                "name='" + name + '\'' +
                ", faculties=" + Arrays.toString(faculties) +
                ", groups=" + Arrays.toString(groups) +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
