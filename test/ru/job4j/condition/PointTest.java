package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.calculator.Fit;

public class PointTest {

    @Test
    public void whenDistanceCoordinate() {
        int x1 = 2;
        int y1 = 2;
        int x2 = 6;
        int y2 = 5;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistancePoint() {
        Point a = new Point(2, 2);
        Point b = new Point(6, 5);
        double expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}