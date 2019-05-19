package com.packt.advancedjavadatastructuresandalgorithms.lesson5;

public class ThreadBlocked {
    
    private static Object lock = new Object();
    
    public static void main(String... args) {
    
        Thread threadA = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread A executing");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    
        Thread threadB = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread B executing");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    
        threadA.start();
        threadB.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread A state: " + threadA.getState());
        System.out.println("Thread B state: " + threadB.getState());
    }
}
