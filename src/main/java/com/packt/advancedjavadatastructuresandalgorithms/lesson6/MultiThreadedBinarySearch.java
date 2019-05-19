package com.packt.advancedjavadatastructuresandalgorithms.lesson6;

public class MultiThreadedBinarySearch {
    
    public static void main(String... args) {
    
    }
    
    private int multithreadedBinarySearch(int[] arrayToSearch, int value) {
        int numberOfThreads = getRealNumberAvailableProcessors();
        int positionFound = -1;
        final int[][] subArrays = getSubArrays(arrayToSearch, numberOfThreads);
        
        for (int i = 0; i <= numberOfThreads; i++) {
            final int index = i;
            Thread searcThread = new Thread(() -> {
                SequentialBinarySearch.binarySearch(value, extractArrayFromSubArrays(index, subArrays));
            });
        }
        return positionFound;
    }
    
    private int[] extractArrayFromSubArrays(int index, int[][] subArrays) {
        int[] array = new int[subArrays[index].length];
        for (int i = 0; i < subArrays[index].length; i++) {
            array[i] = subArrays[index][i];
        }
        return array;
    }
    
    protected static int[][] getSubArrays(int[] originalArray, int numberOfThreads) throws IllegalArgumentException {
        int arraySize = originalArray.length;
        if (numberOfThreads <= 0 || numberOfThreads > arraySize) {
            throw new IllegalArgumentException();
        }
        int numberOfElementsPerArray = 0;
        boolean isOddNumber = false;
        if ((arraySize % numberOfThreads) > 0) {
            isOddNumber = true;
            numberOfElementsPerArray = (arraySize / numberOfThreads) + 1;
        } else {
            numberOfElementsPerArray = arraySize / numberOfThreads;
        }
        int[][] subArrays = new int[numberOfThreads][numberOfElementsPerArray];
        int subArrayNumber = 0;
        int subArrayIndex = 0;
        for (int i = 0; i < arraySize; i++) {
            subArrays[subArrayNumber][subArrayIndex++] = originalArray[i];
            if ((isOddNumber && (subArrayIndex == numberOfElementsPerArray - 1) && (subArrayNumber < numberOfThreads - 1)) ||
                    subArrayIndex == numberOfElementsPerArray) {
                subArrayIndex = 0;
                subArrayNumber++;
            }
        }
        return subArrays;
    }
    
    
    private static int getRealNumberAvailableProcessors() {
        return Runtime.getRuntime().availableProcessors() - Thread.activeCount();
    }
}
