package ru.job4j.condition;

/**
 * Class Point
 * Класс рассчитывает расстояние между двумя точками.
 * @author Dmitry Razumov
 * @version 2
 */
public class Point {
    /**
     * Координата X.
     */
    private int x;

    /**
     * Координата Y.
     */
    private int y;

    /**
     * Конструктор - инициализирует начальные координаты точки.
     * @param first Координата X
     * @param second Координата Y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Метод вычисляет расстояние между двумя точками.
     * На вход метода подается точка относительно которой нужно рассчитать расстояние от текущей.
     * @param that Объект - точка
     * @return Расстояние между точками
     */
    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    /**
     * Метод вычисляет расстояние между двумя точками.
     * @param x1 Координа х первой точки
     * @param y1 Координата у первой точки
     * @param x2 Координата х второй точки
     * @param y2 Координата у второй точки
     * @return Расстояние между точками
     */
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    /**
     * Главный метод программы. Вычисляет расстояние между точками и выводит значение на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
