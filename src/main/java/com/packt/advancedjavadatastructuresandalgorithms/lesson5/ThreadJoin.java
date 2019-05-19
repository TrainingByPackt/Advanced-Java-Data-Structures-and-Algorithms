package com.packt.advancedjavadatastructuresandalgorithms.lesson5;

public class ThreadJoin {
    public static void main(String... args) {
    
        Thread threadA = new Thread(() -> {
            System.out.println("Thread A executing");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread A finished the execution");
        });
        
        threadA.start();
        
        try {
            threadA.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
        System.out.println("This should be printed only after Thread A finishes execution");
    }
}
