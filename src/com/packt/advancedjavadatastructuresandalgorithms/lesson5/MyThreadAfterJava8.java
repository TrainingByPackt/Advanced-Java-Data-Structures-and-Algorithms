package com.packt.advancedjavadatastructuresandalgorithms.lesson5;

public class MyThreadAfterJava8 {
    public static void main(String... args) {
        Thread myThread = new Thread(() -> System.out.println("My thread after Java 8 is running"));
        myThread.start();
    }
}
