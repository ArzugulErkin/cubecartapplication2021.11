package com.unitedcoder.classconcepts.package2;

import com.unitedcoder.classconcepts.package1.Student;

public class StudentInfo2 extends Student{
    public StudentInfo2(String firstName, String lastName, String gender) {
        super(firstName, lastName, gender);
    }

    public static void main(String[] args) {
        Student student=new Student("Tom","Jim","Male");
        StudentInfo2 studentInfo2=new StudentInfo2("","","");
        System.out.println(studentInfo2.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getGender());

    }
}
