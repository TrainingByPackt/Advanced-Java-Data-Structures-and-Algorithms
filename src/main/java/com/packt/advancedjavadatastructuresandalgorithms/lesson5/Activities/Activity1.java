package com.packt.advancedjavadatastructuresandalgorithms.lesson5.Activities;

import java.util.Arrays;

public class Activity1 {
    public static void main(String... args) {
        Thread threadA = new Thread(() -> {
            Thread thisThreadA = Thread.currentThread();
            System.out.println("Id_A: " + thisThreadA.getId());
            System.out.println("Name_A: " + thisThreadA.getName());
            System.out.println("Group_A: " + thisThreadA.getThreadGroup());
            System.out.println("Priority_A: " + thisThreadA.getPriority());
            StringBuilder stacktrace_A = new StringBuilder();
            Arrays.stream(thisThreadA.getStackTrace()).map(StackTraceElement::toString).forEach(stacktrace_A::append);
            System.out.println("Stacktrace_A: " + stacktrace_A.toString());
        });
        
        Thread threadB = new Thread(() -> {
            Thread thisThreadB = Thread.currentThread();
            System.out.println("Id_B: " + thisThreadB.getId());
            System.out.println("Name_B: " + thisThreadB.getName());
            System.out.println("Group_B: " + thisThreadB.getThreadGroup());
            System.out.println("Priority_B: " + thisThreadB.getPriority());
            StringBuilder stacktrace_B = new StringBuilder();
            Arrays.stream(thisThreadB.getStackTrace()).map(StackTraceElement::toString).forEach(stacktrace_B::append);
            System.out.println("Stacktrace_B: " + stacktrace_B.toString());
        });
        
        threadA.setName("Thread-A");
        threadA.setPriority(1);
        
        threadB.setName("Thread-B");
        threadB.setPriority(2);
        
        threadA.start();
        threadB.start();
    }
    
}
