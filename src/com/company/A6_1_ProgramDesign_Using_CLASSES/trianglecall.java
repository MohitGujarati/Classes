package com.company.A6_1_ProgramDesign_Using_CLASSES;

public class trianglecall {
    public static void main(String[] args) {
        Triangle triangleA=new Triangle(15,8,15,8,17);

        Triangle triangleb=new Triangle(32,2.59,3,3,3);

        double triangleArea=triangleA.findArea();
        System.out.println(triangleArea);

        double triangle=triangleb.findArea();
        System.out.println(triangle);
        System.out.println(triangleA.base);
        System.out.println(triangleb.base);
        System.out.println(Triangle.num);
    }
}

