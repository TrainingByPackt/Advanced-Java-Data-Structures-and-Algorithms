package com.packt.advancedjavadatastructuresandalgorithms.lesson5;

public class ThreadWaiting {
    
    private static Object lock = new Object();
    
    public static void main(String... args) {
        
        Thread threadA = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread A executing");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadA.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread A state: " + threadA.getState());
        synchronized (lock) {
            lock.notify();
        }
    }
}
