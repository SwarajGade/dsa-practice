package com.swaraj.dsa.arrays.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    // Normal working case
    @Test
    void basicCase() {

        // 2 + 7 = 9
        int[] result = twoSum.solve(new int[]{2,7,11,15}, 9);

        assertArrayEquals(new int[]{0,1}, result);
    }

    // Duplicate numbers forming the solution
    @Test
    void duplicateNumbers() {

        // 3 + 3 = 6
        int[] result = twoSum.solve(new int[]{3,3}, 6);

        assertArrayEquals(new int[]{0,1}, result);
    }

    // Negative numbers case
    @Test
    void negativeNumbers() {

        // -3 + -5 = -8
        int[] result = twoSum.solve(new int[]{-1,-2,-3,-4,-5}, -8);

        assertArrayEquals(new int[]{2,4}, result);
    }

    // No valid pair exists
    @Test
    void noSolution() {

        int[] result = twoSum.solve(new int[]{1,2,3}, 7);

        // Should return an empty array
        assertEquals(0, result.length);
    }

    // Edge case: empty array
    @Test
    void emptyArray() {

        int[] result = twoSum.solve(new int[]{}, 5);

        assertEquals(0, result.length);
    }

    // Edge case: only one number
    @Test
    void singleElement() {

        int[] result = twoSum.solve(new int[]{5}, 5);

        assertEquals(0, result.length);
    }
}