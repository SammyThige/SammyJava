package com.company;
import java.util.Scanner;
import java.time.LocalTime;//package for time
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;//package for changing thr format of date and time
public class input {
    public static void main(String[] args) {
        //Date and Time input
        LocalDateTime myTime=LocalDateTime.now().now();
       DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
       String formattedDate = myTime.format(myFormatter);
       System.out.println(formattedDate);



        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter name, age and salary:");

        // String input
        String name = myScan.nextLine();

        // Numerical input
        int age = myScan.nextInt();
        double salary = myScan.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
