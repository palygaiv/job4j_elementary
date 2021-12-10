package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        double p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

   @Test
    public void whenP8K3Square3() {
        double expected = 3;
        double p = 8;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K12Square3Dot99() {
        double expected = 3.99;
        double p = 15;
        double k = 12;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}