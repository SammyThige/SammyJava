package com.company;
//continuation of methods
public class Second {
    int p=34;
    static void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    static void spee(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);


    }
public  static void main(String[] args) {
        fullThrottle();
        Second mySec = new Second();
        spee(87);

}
}
