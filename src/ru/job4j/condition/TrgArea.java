package ru.job4j.condition;

/**
 * Class TrgArea
 * Класс вычисляет площадь треугольника.
 * @author Dmitry Razumov
 * @version 1
 */
public class TrgArea {
    /**
     * Метод вычисляет прощадь треугольника по трем сторонам.
     * @param a Длина стороны A
     * @param b Длина стороны B
     * @param c Длина стороны C
     * @return Площадь
     */
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return rsl;
    }

    /**
     * Главный метод программы. Проверяет работу метода TrgArea. Результат выводит на консоль.
     * @param args Параметры командной строки.
     */
    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
