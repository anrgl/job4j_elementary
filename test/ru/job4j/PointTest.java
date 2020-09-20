package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        int expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to15then2() {
        Point a = new Point(1, 3);
        Point b = new Point(1, 5);
        int expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when4224to4224then0() {
        Point a = new Point(42, 24);
        Point b = new Point(42, 24);
        int expected = 0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to222then346() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 2, 2);
        double expected = 3.46;
        double out = a.distance3D(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to333then520() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(3, 3, 3);
        double expected = 5.20;
        double out = a.distance3D(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}