package architecture;

import java.util.ArrayList;

public class Faculty {
    private String name;
    private ArrayList<Group> groups;

    public Faculty(String name) {
        this.name = name;
    }

    public Faculty(String name, ArrayList<Group> groups) {
        this.name = name;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public double averageScaleInGroupBySubject(Group group, Subjects subject){
        int sum = 0;
        int count = 0;
        ArrayList<Student> students = new ArrayList(group.getStudents());
        for(Student student: students){
            if(student.getProgramm().containsKey(subject))
            {
                sum += student.getProgramm().get(subject);
                count++;
            }
        }
        return sum/count;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", groups=" + groups +
                '}';
    }
}
