package ru.job4j.condition;

/**
 * Class Point
 * Класс рассчитывает расстояние между двумя точками.
 * @author Dmitry Razumov
 * @version 2.5
 */
public class Point {
    /**
     * Координата x.
     */
    private int x;

    /**
     * Координата y.
     */
    private int y;
    /**
     * Координата z
     */
    private int z;

    /**
     * Конструктор - инициализирует начальные координаты точки на плоскости.
     * @param first Координата x
     * @param second Координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Конструктор - инициализирует начальные координаты точки в трехмерном пространстве.
     * @param x Координата x
     * @param y Координата y
     * @param z координата z
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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
     * Метод высичляет расстояние между двумя точками в трехмерном пространстве.
     * На вход метода подается точка относительно которой нужно рассчитать расстояние от текущей.
     * @param that Объект - точка
     * @return Расстояние между точками
     */
    public double distance3d(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2) + Math.pow(this.z - that.z, 2));
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
