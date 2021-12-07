package com.company;
import java.util.Scanner;
public class nesting {
    static class OuterClass {
        int x=10;

        private class InnerClass{
            int y=7;
        }
    }

    public static void main(String[] args){
        OuterClass myOutter=new OuterClass();
        OuterClass.InnerClass myInner= myOutter.new InnerClass();
        System.out.println(myInner.y+ myOutter.x);
System.out.println();
    }
}
