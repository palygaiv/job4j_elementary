package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas10Then2() {
        int[] data = {0, 1, 10};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot3ThenMinus1() {
        int[] data = {4, 5, 6, 7, 8, 9};
        int el = 3;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}