package com.company.A6_1_ProgramDesign_Using_CLASSES;

public class student_profile_display {
    String firstName;
    String lastName;
    double gpa;
    double currentyear;

    public student_profile_display(String firstName, String lastName, double gpa,double currentyear){
        this.firstName=firstName;
        this.lastName=lastName;
        this.currentyear=currentyear;
        this.gpa=gpa;

    }
    public int Expyear() {
        int expectedyear = 0;

        if (currentyear == 1) {
            expectedyear = expectedyear + 3;


        } else if (currentyear == 2) {
            expectedyear = expectedyear + 2;

        } else if (currentyear == 3) {
            expectedyear = expectedyear + 1;

        } else if (currentyear == 4) {
            expectedyear = expectedyear + 0;

        }  return expectedyear;

    }
}
