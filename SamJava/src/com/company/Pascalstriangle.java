package com.company;
import java.util.Scanner;

public class Pascalstriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows:");
        int rows = sc.nextInt();
        Printer.printTriangle(rows);
    }
}
