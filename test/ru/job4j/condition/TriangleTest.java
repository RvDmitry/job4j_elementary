package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void whenTriangleExist() {
        Point a = new Point(0, 2);
        Point b = new Point(2, 2);
        Point c = new Point(2, 4);
        Triangle triangle = new Triangle(a, b, c);
        double out = triangle.area();
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenTriangleNoExist() {
        Point a = new Point(0, 2);
        Point b = new Point(2, 2);
        Point c = new Point(2, 2);
        Triangle triangle = new Triangle(a, b, c);
        double out = triangle.area();
        double expected = -1;
        Assert.assertEquals(expected, out, 0.01);
    }
}