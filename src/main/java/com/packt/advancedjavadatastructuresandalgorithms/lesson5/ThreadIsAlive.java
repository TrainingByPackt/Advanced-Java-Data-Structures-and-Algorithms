package com.packt.advancedjavadatastructuresandalgorithms.lesson5;

public class ThreadIsAlive {
    public static void main(String... args) {
        
        Thread threadA = new Thread(() -> {
            System.out.println("Thread A executing");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        threadA.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Is Thread A alive? " + threadA.isAlive());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Is Thread A alive? " + threadA.isAlive());
    }
}
