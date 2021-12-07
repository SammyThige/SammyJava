package com.company;

public class inheritances {
    static class Vehicle {
        protected String brand = "FORD";
        public  void honk(){
            System.out.println("Pee Pee");
        }
    }

     static class Cars extends Vehicle {
        private String modelName = "Mustang";

    }
    public  static void main(String[] args) {
        Cars myCar = new Cars();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);

    }
}
