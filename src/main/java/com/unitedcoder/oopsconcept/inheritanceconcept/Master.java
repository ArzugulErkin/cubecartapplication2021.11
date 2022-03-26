package com.unitedcoder.oopsconcept.inheritanceconcept;

import java.util.ArrayList;
import java.util.List;

public class Master extends GraduateStudents {

    public static void main(String[] args) {
        Master master=new Master();
        master.setFirstName("bnm");
        master.setLastName("hjkks");
        master.setResearchField("Python");

        Master master1=new Master();
        master1.setFirstName("bnm");
        master1.setLastName("hjkks");
        master1.setResearchField("Python");

        Master master2=new Master();
        master2.setFirstName("bnm");
        master2.setLastName("hjkks");
        master2.setResearchField("Python");
       // System.out.println(master.getFirstName());

        List<Master> masterList=new ArrayList<>();

    }
}
