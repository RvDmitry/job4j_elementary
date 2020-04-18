package ru.job4j.condition;

/**
 * Class SqArea
 * Класс вычисляет площадь прямоугольника.
 * @author Dmitry Razumov
 * @version 1
 */
public class SqArea {
    /**
     * Метод вычисляет площадь прямоугольника через значения его периметра и отношению его сторон.
     * @param p Периметр
     * @param k Коэффициент отношения между сторонами
     * @return Площадь
     */
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double rsl = l * h;
        return rsl;
    }

    /**
     * Главный метод программы. С помощью метода SqArea выполняет расчет плащади заданных прямоугольников
     * и выводит значение на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
