package com.company;
//interfacing
public class abstractionandinterface {
    interface Animal {
        public void  animalSound();
        public  void sleep();
    }

    static class Pig implements Animal {
        @Override
        public void animalSound() {
            System.out.println("Pig says wee");
        }

        @Override
        public void sleep() {
            System.out.println("Zzz");
        }
    }

    //implementing multiple interfaces
    interface FirstInterface {
        public  void myMethod();
    }
    interface SecondInterface {
        public void myMethod2();
    }
    static class Democlass implements FirstInterface,SecondInterface {

        public void myMethod() {
            System.out.println("Some text");
        }
        public void myOtherMethod() {
            System.out.println("Some other text...");
        }

        @Override
        public void myMethod2() {

        }
    }

    //ABSTRACTION
    /*abstract class Animals {
        public abstract void animalSound();
        public void sleep() {
            System.out.println("zZz");
        }
    }
    static class Pig1 extends Animals {
        public void  animalSound(){
            System.out.println("Piggy says wee wee");
        }
    }*/
    public static void  main(String[] args){
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();

        Democlass myObj = new Democlass();
        myObj.myMethod();
        myObj.myOtherMethod();

        /*Pig1 mPig1=new Pig1();
        mPig1.animalSound();
        mPig1.sleep();*/

    }
}
