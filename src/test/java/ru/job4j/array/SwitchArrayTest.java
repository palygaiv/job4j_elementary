package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to7() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int source = 1;
        int dest = 7;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 8, 3, 4, 5, 6, 7, 2};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to0() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int source = 0;
        int dest = 0;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap5to6() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int source = 5;
        int dest = 6;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, 5, 7, 6, 8};
        Assert.assertArrayEquals(expected, result);
    }
}