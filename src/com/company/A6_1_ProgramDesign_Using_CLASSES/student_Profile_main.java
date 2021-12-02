package com.company.A6_1_ProgramDesign_Using_CLASSES;

public class student_Profile_main {
    public static void main(String[] args) {
        student_profile_display student1=new student_profile_display("Mohit","Gujarati",7.32,2);

        double Expectedyear=student1.Expyear();
        System.out.println("First name::"+student1.firstName);
        System.out.println("First name::"+student1.lastName);
        System.out.println("First name::"+student1.gpa);
        System.out.println("Expected year of passing is after "+Expectedyear+" years");




    }
}
