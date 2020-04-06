package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        result = Point.distance(0, 1, 5, 5);
        System.out.println("result (0, 1) to (5, 5) " + result);

        result = Point.distance(2, 2, 4, 10);
        System.out.println("result (2, 2) to (4, 10) " + result);
    }
}