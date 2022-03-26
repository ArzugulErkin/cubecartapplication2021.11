package com.unitedcoder.oopsconcept.inheritanceconcept;

public class GraduateStudents extends Students {
    private String researchField;
    private String advisorName;

    public GraduateStudents() {
        super();
    }

    public GraduateStudents(String researchField, String advisorName) {
        this.researchField = researchField;
        this.advisorName = advisorName;
    }

    public GraduateStudents(String firstName, String lastName, String gender, String major, String className, String researchField, String advisorName) {
        super(firstName, lastName, gender, major, className);
        this.researchField = researchField;
        this.advisorName = advisorName;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }

    @Override
    public String toString() {
//        return "GraduateStudents{" +
//                "researchField='" + researchField + '\'' +
//                ", advisorName='" + advisorName + '\'' +
//                "} " + super.toString();
        return String.format("FirstName=%s LastName=%s Gender=%s Major=%s ResearchField=%s advisor=%s",
                super.getFirstName(),super.getLastName(),super.getGender(),super.getMajor(),researchField,advisorName);
    }
}
