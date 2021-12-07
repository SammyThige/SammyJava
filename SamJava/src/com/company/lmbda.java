package com.company;
import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction {
    String run(String str);
}

public class lmbda {
    public static void main (String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(2);
        numbers.add(9);
        numbers.add(3);
        //numbers.forEach( (n)-> {System.out.println(n);});
        Consumer<Integer> method = (n)-> {System.out.println(n); };
        numbers.forEach(method);
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
