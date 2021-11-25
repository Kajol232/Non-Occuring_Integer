package com.company;

import java.util.Arrays;

public class Process {
    public  int smallestNonOccurringIntegerInArray(int[] array){
        Arrays.sort(array);
        int expected;
        if(array[0] < 0){
            expected = 0;
        }else{
            expected = array[0];
        }

        for(int i = 0; i < array.length; i++) {

            if(array[i] < 0){
                continue;
            }
            if(expected == 0 && array[i] > 0){
                expected++;
                continue;
            }
            if(array[i] != expected && array[i] >0){
                continue;
            }else{
                expected++;
            }

        }

        return  expected;
    }
}
