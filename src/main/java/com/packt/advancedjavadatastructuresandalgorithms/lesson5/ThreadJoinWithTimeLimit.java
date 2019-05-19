package com.packt.advancedjavadatastructuresandalgorithms.lesson5;

public class ThreadJoinWithTimeLimit {
    public static void main(String... args) {
        
        Thread threadA = new Thread(() -> {
            System.out.println("Thread A executing");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread A finished the execution");
        });
        
        threadA.start();
        
        try {
            threadA.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("This should be printed after the join method has await for 1 second to Thread A to execute.");
    }
}
