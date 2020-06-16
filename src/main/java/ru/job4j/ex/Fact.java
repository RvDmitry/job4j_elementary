package ru.job4j.ex;

/**
 * Class Fact
 * Класс вычисляет факториал.
 * @author Dmitry Razumov
 * @version 1
 */
public class Fact {
    /**
     * Главный метод программы.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        System.out.println(new Fact().calc(-3));
    }

    /**
     * Метод вычисляет факториал числа.
     * @param n Число, факториал которого нужно вычислить
     * @return Факториал числа
     */
    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The number cannot be negative.");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
