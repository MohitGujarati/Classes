package com.company.A6_1_ProgramDesign_Using_CLASSES;

public class Triangle {

    static int num=3;

        double base;
        double height;
        double sideLenOne;
        double sidelentwo;
        double sidelenthree;

        public Triangle(double base,double height,double sideLenOne, double sidelentwo, double sidelenthree){
            this.base=base;
            this.height=height;
            this.sidelentwo=sidelentwo;
            this.sideLenOne=sideLenOne;
            this.sidelenthree=sidelenthree;


        }
        public double findArea(){
            return (this.base*this.height)/2;
        }


    }


