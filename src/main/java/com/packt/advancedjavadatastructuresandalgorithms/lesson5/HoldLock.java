package com.packt.advancedjavadatastructuresandalgorithms.lesson5;

public class HoldLock {
    private static Object lock = new Object();
    
    public static void main(String... args) {
        
        Thread threadA = new Thread(() -> {
            System.out.println("Is Thread A holding the lock? " + Thread.holdsLock(lock));
            synchronized (lock) {
                System.out.println("Thread A executing");
                try {
                    System.out.println("Is Thread A holding the lock? " + Thread.holdsLock(lock));
                    lock.wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadA.start();
        synchronized (lock) {
            lock.notify();
        }
    }
}
