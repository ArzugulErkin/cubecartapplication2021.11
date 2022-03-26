package com.unitedcoder.oopsconcept.inheritanceconcept;


import java.util.ArrayList;
import java.util.List;

public class StudentInformation {
    public static void main(String[] args) {
        GraduateStudents graduateStudents=new GraduateStudents();
        graduateStudents.setFirstName("James");
        graduateStudents.setLastName("BB");
        graduateStudents.setGender("Male");
        graduateStudents.setMajor("Tester");
        graduateStudents.setResearchField("Selenium Test");


        GraduateStudents graduateStudents1=new GraduateStudents();
        graduateStudents1.setFirstName("Mike");
        graduateStudents1.setLastName("BBM");
        graduateStudents1.setGender("Male");
        graduateStudents1.setMajor("Developer");
        graduateStudents1.setResearchField("Java Backend Developer");

        GraduateStudents graduateStudents2=new GraduateStudents();
        graduateStudents2.setFirstName("Tom");
        graduateStudents2.setLastName("BBT");
        graduateStudents2.setGender("Male");
        graduateStudents2.setMajor("Devops");
        graduateStudents2.setResearchField("MS Azure Dev");

        //System.out.println(graduateStudents.toString());

        List<GraduateStudents> studentList=new ArrayList<>();
        studentList.add(graduateStudents1);
        studentList.add(graduateStudents2);
        studentList.add(graduateStudents);

        for(GraduateStudents students:studentList){
            System.out.println(students);
        }


    }
}
