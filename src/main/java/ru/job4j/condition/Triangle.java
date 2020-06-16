package ru.job4j.condition;

/**
 * Class Triangle
 * Класс проверяет существует ли треугольник и если существует, то вычисляет его площадь.
 * @author Dmitry Razumov
 * @version 2
 */
public class Triangle {
    /**
     * Первая точка треугольника.
     */
    private Point first;
    /**
     * Вторая точка треугольника.
     */
    private Point second;
    /**
     * Третья точка треугольника.
     */
    private Point third;

    /**
     * Конструктор создает треугольник по трем точкам.
     * @param ap Первая точка
     * @param bp Вторая точка
     * @param cp Третья точка
     */
    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод вычисляет периметр по длинам сторон.
     * @param a Расстояние между точками a b
     * @param c Расстояние между точками a c
     * @param b Расстояние между точками b c
     * @return Периметр.
     */
    public double period(double a, double c, double b) {
        return (a + c + b) / 2;
    }

    /**
     * Метод вычисляет площадь треугольника.
     * @return Площадь, если треугольник существует или -1.
     */
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double c = first.distance(third);
        double b = second.distance(third);
        double p = period(a, c, b);
        if (this.exist(a, c, b)) {
            rsl = Math.sqrt(p * (p - a) * (p - c) * (p - b));
        }
        return rsl;
    }

    /**
     * Метод проверяет существует ли треугольник. Проверка заключается в оценке всех сторон треугольника.
     * Правило оценки: сумма любой из двух сторон всегда больше оставшейся стороны.
     * @param a Длина от точки a b
     * @param c Длина от точки a c
     * @param b Длина от точки b c
     * @return true, если треугольник существует, false, если не существует
     */
    private boolean exist(double a, double c, double b) {
        return (a + c) > b && (c + b) > a && (a + b) > c;
    }
}
