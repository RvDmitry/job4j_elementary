package ru.job4j.loop;

/**
 * Class Factorial
 * Класс вычисляет факториал числа.
 * @author Dmitry Razumov
 * @version 1
 */
public class Factorial {
    /**
     * Метод вычисляет факториал заданного числа.
     * @param n Число
     * @return Факториал числа
     */
    public static int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
