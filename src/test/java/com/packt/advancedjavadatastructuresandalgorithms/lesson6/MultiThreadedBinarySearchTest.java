package com.packt.advancedjavadatastructuresandalgorithms.lesson6;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MultiThreadedBinarySearchTest {
    
    @Test
    public void shouldReturnOneSubArray() {
        int[] arrayToSplit = {0,1,2,3,4,5,6,7,8,9};
        int numberOfSubArrays = 1;
        int[][] expectedSubArrays = new int[1][10];
        expectedSubArrays[0][0] = 0;
        expectedSubArrays[0][1] = 1;
        expectedSubArrays[0][2] = 2;
        expectedSubArrays[0][3] = 3;
        expectedSubArrays[0][4] = 4;
        expectedSubArrays[0][5] = 5;
        expectedSubArrays[0][6] = 6;
        expectedSubArrays[0][7] = 7;
        expectedSubArrays[0][8] = 8;
        expectedSubArrays[0][9] = 9;
        int[][] actualSubArrays = MultiThreadedBinarySearch.getSubArrays(arrayToSplit, numberOfSubArrays);
        
        assertArrayEquals(expectedSubArrays, actualSubArrays);
    }
    
    @Test
    public void shouldReturnTwoSubArrays() {
        int[] arrayToSplit = {0,1,2,3,4,5,6,7,8,9};
        int numberOfSubArrays = 2;
        int[][] expectedSubArrays = new int[2][5];
        expectedSubArrays[0][0] = 0;
        expectedSubArrays[0][1] = 1;
        expectedSubArrays[0][2] = 2;
        expectedSubArrays[0][3] = 3;
        expectedSubArrays[0][4] = 4;
        expectedSubArrays[1][0] = 5;
        expectedSubArrays[1][1] = 6;
        expectedSubArrays[1][2] = 7;
        expectedSubArrays[1][3] = 8;
        expectedSubArrays[1][4] = 9;
        int[][] actualSubArrays = MultiThreadedBinarySearch.getSubArrays(arrayToSplit, numberOfSubArrays);
    
        assertArrayEquals(expectedSubArrays, actualSubArrays);
    }
    
    @Test
    public void shouldReturnThreeSubArrays() {
        int[] arrayToSplit = {0,1,2,3,4,5,6,7,8,9};
        int numberOfSubArrays = 3;
        int[][] expectedSubArrays = new int[3][4];
        expectedSubArrays[0][0] = 0;
        expectedSubArrays[0][1] = 1;
        expectedSubArrays[0][2] = 2;
        expectedSubArrays[1][0] = 3;
        expectedSubArrays[1][1] = 4;
        expectedSubArrays[1][2] = 5;
        expectedSubArrays[2][0] = 6;
        expectedSubArrays[2][1] = 7;
        expectedSubArrays[2][2] = 8;
        expectedSubArrays[2][3] = 9;
        int[][] actualSubArrays = MultiThreadedBinarySearch.getSubArrays(arrayToSplit, numberOfSubArrays);
        
        assertArrayEquals(expectedSubArrays, actualSubArrays);
    }
    
    @Test
    public void shouldReturnTenSubArrays() {
        int[] arrayToSplit = {0,1,2,3,4,5,6,7,8,9};
        int numberOfSubArrays = 10;
        int[][] expectedSubArrays = new int[10][1];
        expectedSubArrays[0][0] = 0;
        expectedSubArrays[1][0] = 1;
        expectedSubArrays[2][0] = 2;
        expectedSubArrays[3][0] = 3;
        expectedSubArrays[4][0] = 4;
        expectedSubArrays[5][0] = 5;
        expectedSubArrays[6][0] = 6;
        expectedSubArrays[7][0] = 7;
        expectedSubArrays[8][0] = 8;
        expectedSubArrays[9][0] = 9;
        int[][] actualSubArrays = MultiThreadedBinarySearch.getSubArrays(arrayToSplit, numberOfSubArrays);
        
        assertArrayEquals(expectedSubArrays, actualSubArrays);
    }
    
    @Test
    public void shouldThrowsAnExceptionForZeroSubArrays() {
        assertThrows(IllegalArgumentException.class, () -> {
            int[] arrayToSplit = {0,1,2,3,4,5,6,7,8,9};
            int numberOfSubArrays = 0;
            MultiThreadedBinarySearch.getSubArrays(arrayToSplit, numberOfSubArrays);
        });
    }
    
    @Test
    public void shouldThrowsAnExceptionForInvalidNumberOfSubArrays() {
        assertThrows(IllegalArgumentException.class, () -> {
            int[] arrayToSplit = {0,1,2,3,4,5,6,7,8,9};
            int numberOfSubArrays = 11;
            MultiThreadedBinarySearch.getSubArrays(arrayToSplit, numberOfSubArrays);
        });
    }
    
}
