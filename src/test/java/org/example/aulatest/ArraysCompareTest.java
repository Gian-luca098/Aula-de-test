package org.example.aulatest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysCompareTest {
    @Test
    void Test(){
        int [] numbers = {12,2,34,4,20};
        int []expectedArray = {12,2,34,4,20};

        Arrays.sort(numbers);

        assertArrayEquals(numbers,expectedArray);

    }
    @Test
    //@timeout(i)
    @Timeout(value = 15,unit = TimeUnit.MILLISECONDS)
    void testSortPerformace(){
        int [] numbers = {12,2,34,4,20};
        for(int i=0;i<10000000;i++){
            numbers[0]=i;
            Arrays.sort(numbers);
        }
    }

}
