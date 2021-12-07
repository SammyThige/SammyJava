package com.company;

import java.util.ArrayList;
import  java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String num = "123";
        int conv = Integer.parseInt(num);
        System.out.println(conv);
        Integer myInt = 100;
        String myString = myInt.toString();
        System.out.println(myString.length());


        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);//pattern class defines the pattern that'll be used for searching
       //Pattern.CASE_INSENSITIVE means that case of letters will be ignored
        // Pattern.LITERAL special characters will be treated as ordinary characters
        //Pattern.UNICODE_CASE is used together with CASE_INSENSITIVE to ignore case of letters outside the english alphabet
        Matcher matcher = pattern.matcher("Visit W3Schools!");//matcher class is used for searching for the pattern
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
        };
    }

