package com.packt.advancedjavadatastructuresandalgorithms.lesson5;

public class MyThreadExtendingThread extends Thread {
    
    public static void main(String... args) {
        MyThreadExtendingThread myThread = new MyThreadExtendingThread();
        myThread.setName("test");
        myThread.start();
        myThread.getThreadGroup();
    }
    
    @Override
    public void run() {
        System.out.println(this.getName());
        System.out.println("My extended thread is running");
    }

}