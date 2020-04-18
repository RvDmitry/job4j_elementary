package ru.job4j.condition;

/**
 * Class Triangle
 * Класс проверяет существует ли треугольник.
 * @author Dmitry Razumov
 * @version 1
 */
public class Triangle {
    /**
     * Метод проверяет существует ли треугольник. Проверка заключается в оценке всех сторон треугольника.
     * Правило оценки: сумма любой из двух сторон всегда больше оставшейся стороны.
     * @param ab Сторона AB
     * @param ac Сторона AC
     * @param bc Сторона BC
     * @return true, если треугольник существует, false, если не существует
     */
    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac) > bc && (ac + bc) > ab && (ab + bc) > ac;
    }
}
