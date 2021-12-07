package com.company;
import java.util.*;

public class arraylis {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<String>(); //declaring the array list
        car.add("Volvo");//adding values to the string
        car.add("BMW");
        car.get(1);//accessing an element
        car.set(0, "Polo");// changing the value of an element
        car.remove(1);//removing an element from arraylist
        car.clear();//removes all elements from an array list
        car.size();//size of arraylist

        for (int i=0;i<car.size();i++) { //looping through an arraylist
            System.out.println(car.get(i));
        }
        Collections.sort(car); //sorting the array list
        for (String i:car) {        //for each loop
            System.out.println(i);
        }
        System.out.println(car);
        //HASHMAPS
        //The first object is used as a key for the other object(values)
        HashMap<String, String> capCities = new HashMap<String, String>();//declaring a hashmap
        capCities.put("England", "London"); //adding items to a hashmap
        capCities.put("Germany", "Berlin");
        capCities.put("Romania", "Bucharest");
        System.out.println(capCities);
        capCities.get("England");//accessing an item
        capCities.remove("England"); //removing an element
        capCities.clear();// clearing all elements
        capCities.size();//size of a hashmap
        for (String i: capCities.keySet()) { //use keyset() if you only want the keys
            System.out.println("key: " + i + "value: " + capCities.get(i)); //printing both keys and values
        }
        for (String j: capCities.values()) { //use values() if you want the values
            System.out.println(j);
        }



        //LINKED LIST
        //linkedlist should be used when manipulating data
        //stores data in containers and each container has a link to the next. when adding an item it is placed in a new container which is linked to another container
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.addFirst("Mazda");	//Adds an item to the beginning of the list.
        cars.addLast("Lambo");   //Add an item to the end of the list
        cars.removeFirst();         //Remove an item from the beginning of the list.
        cars.removeLast();          //Remove an item from the end of the list
        cars.getFirst();            //Get the item at the beginning of the list
        cars.getLast();             //Get the item at the end of the list

        System.out.println(cars);

        //HASHSETS
        //collection of items where each item is unique
        HashSet<String> vehicle= new HashSet<String>(); //declaring a hashset
        vehicle.add("Ferrari"); //adding elements in the hashset
        vehicle.add("Jeep");
        vehicle.contains("Jeep"); //checking whether an item exits
        vehicle.remove("Ferrari"); //removing an element
        vehicle.clear(); //clearing all elements
        vehicle.size(); //finding out the elements in a hashset
        for (String i: vehicle) { //looping through a hashset
            System.out.println(i);
        }
    }
}
