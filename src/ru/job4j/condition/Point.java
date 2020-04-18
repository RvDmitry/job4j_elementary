package ru.job4j.condition;

/**
 * Class Point
 * Класс расчитывает расстояние между двумя точками.
 * @author Dmitry Razumov
 * @version 1
 */
public class Point {
    /**
     * Метод вычисляет расстояние между двумя точками.
     * @param x1 Координа х первой точки
     * @param y1 Координата у первой точки
     * @param x2 Координата х второй точки
     * @param y2 Координата у второй точки
     * @return Расстояние
     */
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    /**
     * Главный метод программы. Вычисляет расстояние между точками и выводит значение на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(0, 1, 5, 5);
        System.out.println("result (0, 1) to (5, 5) " + result);
        result = Point.distance(2, 2, 4, 10);
        System.out.println("result (2, 2) to (4, 10) " + result);
    }
}
