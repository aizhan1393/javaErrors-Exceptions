package architecture;

import exceptions.NoFacultiesAtUniversityException;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Faculty> faculties;

    public University(String name) {
        this.name = name;
    }

    public University(String name, ArrayList<Faculty> faculties) {
        this.name = name;
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public double averageScaleBySubject(Subjects subject){
        int sum = 0;
        int count = 0;
        ArrayList<Student> students = new ArrayList(getAllStudents());
        for(Student student: students){
            if(student.getProgramm().containsKey(subject))
            {
                sum += student.getProgramm().get(subject);
                count++;
            }
        }
        return sum/count;
    }

    public ArrayList<Student> getAllStudents(){
        ArrayList<Student> allStudents = new ArrayList();
        ArrayList<Faculty> faculties = new ArrayList(getFaculties());
        for(Faculty faculty: faculties){
            ArrayList<Group> groups = new ArrayList<>(faculty.getGroups());
            for(Group group: groups){
                ArrayList<Student> students = new ArrayList(group.getStudents());
                for(Student student: students){
                    allStudents.add(student);
                }
            }
        }
        return allStudents;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", faculties=" + faculties +
                '}';
    }
}
