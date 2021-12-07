package com.company;

import java.lang.Thread;
//enum is a class that represents a group of constants
//enum is just like a class but the values inside cannot be changed, cannot create objects and cannot be inherited
public class enumerations {
    enum level { //enum inside a class
        LOW,MEDIUM,HIGH;
    }
    public static void main(String[] args) {
        /*level myVar = level.MEDIUM;
        switch (myVar) { //enum in switch case statement
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
        }*/
        //System.out.println(myVar);
        for (level myVar : level.values()) {
            System.out.println(myVar);
        }


        for(Thread.State s : Thread.State.values()) System.out.println(s);


    }
}
