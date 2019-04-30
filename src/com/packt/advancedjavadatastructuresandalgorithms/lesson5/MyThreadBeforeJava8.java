package com.packt.advancedjavadatastructuresandalgorithms.lesson5;

public class MyThreadBeforeJava8 {
    
    public static void main(String... args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("My thread before Java 8 is running");
            }
        });
        myThread.start();
    }
    
}
