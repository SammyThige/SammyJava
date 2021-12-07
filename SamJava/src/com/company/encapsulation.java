package com.company;
import  java.util.Scanner;
public class encapsulation {
    private String name;

    public String getName(){
        return name;
    }

    public String setName(String newName) {
        this.name = newName;
        return newName;
    }

    public  static void main(String[] args)
    {
          encapsulation myEncap = new encapsulation();
          //myEncap.setName("Sam");
          //System.out.println(myEncap.getName());
          Scanner myScan = new Scanner(System.in);
          String username;
          System.out.println("Enter username:");
          username = myScan.nextLine();
          myEncap.setName(username);
          System.out.println(myEncap.getName());




    }
}
