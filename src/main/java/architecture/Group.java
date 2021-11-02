package architecture;

import java.util.ArrayList;

public class Group {
    private String name;
    private ArrayList<Student> students;

    public Group(String name) {
        this.name = name;
    }

    public Group(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
