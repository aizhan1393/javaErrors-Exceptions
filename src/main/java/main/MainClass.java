package main;

import architecture.*;
import exceptions.*;

import javax.security.auth.Subject;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) throws NoFacultiesAtUniversityException, NoGroupsOnFacultyException, NoStudentsInGroupException, StudentDoenNotHaveAnySubjectException, IncorrectScaleException {
        HashMap<Subjects,Integer> AliceProgram = new HashMap<>();
        AliceProgram.put(Subjects.ENGLISH,9);
        AliceProgram.put(Subjects.PHILOSOFY,7);

        for(Map.Entry<Subjects,Integer> pair: AliceProgram.entrySet()){
            if(pair.getValue() < 0 | pair.getValue() > 10){
                throw new IncorrectScaleException();
            }
        }

        Student studentAlice = new Student("Alice", AliceProgram);
        if(studentAlice.getProgramm().size() < 1){
            throw new StudentDoenNotHaveAnySubjectException();
        }

        HashMap<Subjects,Integer> TomProgram = new HashMap<>();
        TomProgram.put(Subjects.ENGLISH,8);
        TomProgram.put(Subjects.PHILOSOFY,9);

        for(Map.Entry<Subjects,Integer> pair: TomProgram.entrySet()){
            if(pair.getValue() < 0 | pair.getValue() > 10){
                throw new IncorrectScaleException();
            }
        }

        Student studentTom = new Student("Tom", TomProgram);
        if(studentTom.getProgramm().size() < 1){
            throw new StudentDoenNotHaveAnySubjectException();
        }


        ArrayList<Student> studentsGroup1 = new ArrayList<>();
        studentsGroup1.add(studentAlice);
        studentsGroup1.add(studentTom);

        Group group1 = new Group("group1", studentsGroup1);
        if(group1.getStudents().isEmpty()){
            throw new NoStudentsInGroupException();
        }

        ArrayList<Group> inyazGroups = new ArrayList<>();
        inyazGroups.add(group1);

        Faculty inyaz = new Faculty("INYAZ", inyazGroups);
        if(inyaz.getGroups().isEmpty()){
            throw new NoGroupsOnFacultyException();
        }



        HashMap<Subjects,Integer> DenProgram = new HashMap<>();
        DenProgram.put(Subjects.LINEARALGEBRA,6);
        DenProgram.put(Subjects.PHILOSOFY,7);

        for(Map.Entry<Subjects,Integer> pair: DenProgram.entrySet()){
            if(pair.getValue() < 0 | pair.getValue() > 10){
                throw new IncorrectScaleException();
            }
        }

        Student studentDen = new Student("Den",DenProgram);
        if(studentDen.getProgramm().size() < 1){
            throw new StudentDoenNotHaveAnySubjectException();
        }

        ArrayList<Student> studentsGroup2 = new ArrayList<>();
        studentsGroup2.add(studentDen);

        Group group2 = new Group("group2", studentsGroup2);
        if(group2.getStudents().isEmpty()){
            throw new NoStudentsInGroupException();
        }

        ArrayList<Group> mathGroups = new ArrayList<>();
        mathGroups.add(group2);

        Faculty math = new Faculty("MATH", mathGroups);
        if(math.getGroups().isEmpty()){
            throw new NoGroupsOnFacultyException();
        }

        HashMap<Subjects,Integer> BenProgram = new HashMap<>();
        BenProgram.put(Subjects.MATHEMATICALANALYSIS,9);
        BenProgram.put(Subjects.PRACTICALONPC, 8);

        for(Map.Entry<Subjects,Integer> pair: BenProgram.entrySet()){
            if(pair.getValue() < 0 | pair.getValue() > 10){
                throw new IncorrectScaleException();
            }
        }

        Student studentBen = new Student("Ben",BenProgram);
        if(studentBen.getProgramm().size() < 1){
            throw new StudentDoenNotHaveAnySubjectException();
        }

        ArrayList<Student> studentsGroup3 = new ArrayList<>();
        studentsGroup3.add(studentBen);

        Group group3 = new Group("group3", studentsGroup3);
        if(group3.getStudents().isEmpty()){
            throw new NoStudentsInGroupException();
        }

        ArrayList<Group> mathApplyingGroups = new ArrayList<>();
        mathApplyingGroups.add(group3);

        Faculty mathApplying = new Faculty("MATHAPPLYING", mathApplyingGroups);
        if(mathApplying.getGroups().isEmpty()){
            throw new NoGroupsOnFacultyException();
        }

        ArrayList<Faculty> faculties = new ArrayList<>();
        faculties.add(inyaz);
        faculties.add(math);
        faculties.add(mathApplying);

        University MSU = new University("MSU", faculties);
        if(MSU.getFaculties().isEmpty()){
            throw new NoFacultiesAtUniversityException();
        }

        System.out.println("Alice's average scale is: " + studentAlice.averageScale());

        System.out.println("Average scale in group2 by Linear algebra is: " + math.averageScaleInGroupBySubject(group2, Subjects.LINEARALGEBRA));

        System.out.println("Average scale in MSU by English is: " + MSU.averageScaleBySubject(Subjects.ENGLISH));




    }
}
