package ru.job4j.ex;

/**
 * Class FactRec
 * Класс вычисляет факториал используя рекурсию.
 * @author Dmitry Razumov
 * @version 1
 */
public class FactRec {
    /**
     * Метод вычисляет факториал числа.
     * @param n Число, факториал которого нужно вычислить
     * @return Факториал числа
     */
    public static int calc(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return calc(n - 1) * n;
        }
    }

    /**
     * Главный метод программы.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
