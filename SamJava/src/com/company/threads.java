package com.company;
import java.lang.Thread;
/*public class Mai implements Runnable{
    @Override
    public static void main(String[] args){
    Mai obj = new Mai();// if the class implements the Runnable interface the thread is run by passing an instance of the class through a constructor and calling the start method
    Thread thread = new Thread(obj);
    thread.start();
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}*/ // another way of creating a thread
public class threads extends Thread{
    @Override
    public void run() {
        for (int i = 0 ;i< 11;i++) System.out.println("Run:Thread1:"+i);
    threads thread = new threads();
    thread.start();//if the class extends a thread class it can be run by creating an instance of the class
    System.out.println("This code is outside of the thread");
    }

    public static void main(String[] args) {
        System.out.println("This code is running in a thread");
        Thread t1 = Thread.currentThread();
        for (int i = 0 ;i< 11;i++) System.out.println("Run:Thread2:"+i);
        Thread t2 = new Thread(new threads());
        t2.start();

    }
}
