package architecture;

import java.util.HashMap;
import java.util.Map;

public class Student{
    private String name;
    private Map<Subjects, Integer> programm;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Map<Subjects, Integer> programm) {
        this.name = name;
        this.programm = programm;
    }

    public String getName() {
        return name;
    }

    public Map<Subjects, Integer> getProgramm() {
        return programm;
    }

    public double averageScale(){
        int sum = 0;
        for(Map.Entry<Subjects, Integer> pair: programm.entrySet()){
            sum += pair.getValue();
        }
        return sum/programm.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", programm=" + programm +
                '}';
    }
}
