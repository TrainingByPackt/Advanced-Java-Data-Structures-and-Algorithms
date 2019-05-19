package com.packt.advancedjavadatastructuresandalgorithms.lesson6;

public class SequentialBinarySearch {
    
    

    public static void main(String... args) {
    
        int[] arrayToSearch = {1,2,3,4,5,6,7,8,9,10};
        
        System.out.println("Looking for 1: " + binarySearch(1, arrayToSearch));
        System.out.println("Looking for 2: " + binarySearch(2, arrayToSearch));
        System.out.println("Looking for 3: " + binarySearch(3, arrayToSearch));
        System.out.println("Looking for 4: " + binarySearch(4, arrayToSearch));
        System.out.println("Looking for 5: " + binarySearch(5, arrayToSearch));
        System.out.println("Looking for 6: " + binarySearch(6, arrayToSearch));
        System.out.println("Looking for 7: " + binarySearch(7, arrayToSearch));
        System.out.println("Looking for 8: " + binarySearch(8, arrayToSearch));
        System.out.println("Looking for 9: " + binarySearch(9, arrayToSearch));
        System.out.println("Looking for 10: " + binarySearch(10, arrayToSearch));
    
        System.out.println("Looking for 1: " + recursiveBinarySearch(1, arrayToSearch, 0, arrayToSearch.length -1, 1));
        System.out.println("Looking for 2: " + recursiveBinarySearch(2, arrayToSearch, 0, arrayToSearch.length -1, 1));
        System.out.println("Looking for 3: " + recursiveBinarySearch(3, arrayToSearch, 0, arrayToSearch.length -1, 1));
        System.out.println("Looking for 4: " + recursiveBinarySearch(4, arrayToSearch, 0, arrayToSearch.length -1, 1));
        System.out.println("Looking for 5: " + recursiveBinarySearch(5, arrayToSearch, 0, arrayToSearch.length -1, 1));
        System.out.println("Looking for 6: " + recursiveBinarySearch(6, arrayToSearch, 0, arrayToSearch.length -1, 1));
        System.out.println("Looking for 7: " + recursiveBinarySearch(7, arrayToSearch, 0, arrayToSearch.length -1, 1));
        System.out.println("Looking for 8: " + recursiveBinarySearch(8, arrayToSearch, 0, arrayToSearch.length -1, 1));
        System.out.println("Looking for 9: " + recursiveBinarySearch(9, arrayToSearch, 0, arrayToSearch.length -1, 1));
        System.out.println("Looking for 10: " + recursiveBinarySearch(10, arrayToSearch, 0, arrayToSearch.length -1, 1));

    }


    public static int binarySearch(int valueToFind, int[] arrayToSearch) {
        int leftIndex = 0;
        int rightIndex = arrayToSearch.length -1;
        int i = 0;
        while (leftIndex <= rightIndex) {
            i++;
            int middleIndex = (leftIndex + rightIndex)/2;
            if (arrayToSearch[middleIndex] < valueToFind) {
                leftIndex = middleIndex + 1;
            } else if (arrayToSearch[middleIndex] > valueToFind) {
                rightIndex = middleIndex - 1;
            } else {
                System.out.println("it for " + valueToFind + " = " + i);
                return middleIndex;
            }
        }
        System.out.println("it for " + valueToFind + " = " + i);
        return -1;
    }
    
    public static int recursiveBinarySearch(int valueToFind, int[] arrayToSearch, int leftIndex, int rightIndex, int it) {
        if (rightIndex >= leftIndex) {
            int middleIndex = (leftIndex + rightIndex)/2;
            if (arrayToSearch[middleIndex] == valueToFind) {
                System.out.println("it for " + valueToFind + " = " + it);
                return middleIndex;
            }
            if (arrayToSearch[middleIndex] > valueToFind) {
                return recursiveBinarySearch(valueToFind, arrayToSearch, leftIndex, middleIndex - 1, ++it);
            }
            return recursiveBinarySearch(valueToFind, arrayToSearch, middleIndex + 1, rightIndex, ++it);
        }
        return -1;
    }
    
}
