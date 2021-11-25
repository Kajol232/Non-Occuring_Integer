package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class ProcessTest {
    Process process = new Process();

    @Test
    void smallestNonOccurringIntegerInArray_Without_NegativeValues() {
        int expected = 5;
        Assert.assertEquals(expected, process.smallestNonOccurringIntegerInArray(new int[] {1,3,6,4,1,2}));

    }
    @Test
    void smallestNonOccurringIntegerInArray_With_NegativeValues() {
        int expected = 1;
        Assert.assertEquals(expected, process.smallestNonOccurringIntegerInArray(new int[] {5,-1,-3}));

    }
    @Test
    void smallestNonOccurringIntegerInArray_With_Zeros() {
        int expected = 3;
        Assert.assertEquals(expected, process.smallestNonOccurringIntegerInArray(new int[] {1,2,6,4,0,1,2}));

    }
    @Test
    void smallestNonOccurringIntegerInArray_With_Zeros_And_NegativeValues() {
        int expected = 3;
        Assert.assertEquals(expected, process.smallestNonOccurringIntegerInArray(new int[] {-3,1,2,6,4,0,1,2,-7}));

    }
}