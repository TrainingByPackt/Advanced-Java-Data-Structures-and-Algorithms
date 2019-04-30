package com.packt.advancedjavadatastructuresandalgorithms.lesson5.Activities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Activity3 {
    
    private static final Stream<Integer> arrayA = Stream.of(17930, 17247, 18069, 12526, 13136, 15924, 21034, 13554, 17739, 18238, 15331, 20373, 14033, 21484, 15671, 18904, 11487, 14907, 17394, 18189, 19163, 16450, 18618, 13518, 12347, 17693, 19502, 18586, 13473, 18935);
    private static final Stream<Integer> arrayB = Stream.of(18793, 19053, 13404, 15556, 12707, 17265, 18752, 13927, 15176, 11292, 13914, 21912, 16396, 14029, 20633, 20996, 15569, 16175, 19578, 18599, 19210, 13366, 18819, 20439, 21251, 18362, 11964, 22112, 12644, 19245);
    
    public static void main(String... args) {
        List<Integer> resultArrayA = new ArrayList<>();
        List<Integer> resultArrayB = new ArrayList<>();
        
        Thread threadA = new Thread(() ->
                arrayA.filter(number -> number%2 != 0).forEach(resultArrayA::add)
        );
        
        Thread threadB = new Thread(() ->
                arrayB.filter(number -> number%2 == 0).forEach(resultArrayB::add)
        );
        
        threadA.start();
        threadB.start();
        
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(resultArrayA);
        int sumA = resultArrayA.stream().mapToInt(Integer::intValue).sum();
        int sumB = resultArrayB.stream().mapToInt(Integer::intValue).sum();
        
        System.out.println("Sum A = " + sumA);
        System.out.println("Sum B = " + sumB);
    }
    
}
