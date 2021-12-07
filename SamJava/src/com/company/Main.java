package com.company;
//METHODS or FUNCTIONS

public class Main { //function1
    static  void  myMeth(){
        System.out.println("Sam");
    }
//parameters can be passed to methods through variables
static  void  myMet(String fname,int age){ //function 2
    System.out.println(fname + " "+"is"+" "+age);
}
static int myMe(int x) {//if the method is returning a value or character use int or char instead of void
        return 6+x;
}


//multiple methods can have the same name as long as datatypes are different
static int addMethod(int a,int b){
        return a+b;
}
static  double addMethod(double a, double b){
        return a+b;
}


//METHOD RECURSION
static int sum(int start,int end){
        if(end > start){
            return end + sum(start,end-1);
        }
        else{
            return end;
        }
}

//CLASSES AND OBJECTS
    //static classes can be accessed without objects while public ones need objects
static class MyClass{
        int x=4;
        String fname="Sam";
        String lname="Thigz";
}
int x;//attribute
    public Main() { //creating a constructor
        x=5;
        //constructors must match their class name and do not have a return type like void
    }
    public Main(int y) { //constructors can take parameters
        x=y;
        //parameters are entered in the statement creating an object
    }
    public static void main(String[] args) {

        //METHOD OUTPUTS
	/*myMeth();//calling a method
    myMet("Zamzam",4);//zamzam will be assigned to string fname
    System.out.println(myMe(5));
    System.out.println(addMethod(5,5));//method overloading
    System.out.println(addMethod(5.23,5.43));//method overloadingSystem.out.println(Math.PI);
    System.out.println(sum(0,15));//output of method recursion*/


        MyClass smallClass = new MyClass();//creating an object
        smallClass.x = 43;//changing the value of an attribute
        //if you have multiple objects changing the value of one does not change the values of the other objects
        System.out.println(smallClass.x);
        System.out.println("Firstname:"+smallClass.fname + " "+ "Secondname:"+smallClass.lname);//displaying multiple attributes
        Second smallerClass = new Second();
        System.out.println(smallerClass.p);

        //CONSTRUCTORS
        Main constructorObject = new Main();
        System.out.println(constructorObject.x);
        Main constructorObject1 = new Main(7);
        System.out.println(constructorObject1.x);
    }
}
