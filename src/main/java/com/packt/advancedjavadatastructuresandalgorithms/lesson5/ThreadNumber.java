package com.packt.advancedjavadatastructuresandalgorithms.lesson5;

public class ThreadNumber {
    
    public static void main(String... args) {
        int processors = Runtime.getRuntime().availableProcessors();
        
        System.out.println("Number of available processors: " + processors);
        
        for (int i = 0; i < processors; i++) {
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
 
        System.out.println("Number of active threads: " + Thread.activeCount());
    }
}
