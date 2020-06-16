package ru.job4j.loop;

/**
 * Class Counter
 * Класс вычисляет сумму чисел.
 * @author Dmitry Razumov
 * @version 1
 */
public class Counter {
    /**
     * Метод вычисляет сумму чисел в заданном диаппазоне.
     * @param start Начальное число диаппазона
     * @param finish Конечное число диаппазона
     * @return Сумма чисел
     */
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * Метод вычисляет сумму четных чисел в заданном диаппазоне.
     * @param start Начальное число диаппазона
     * @param finish Конечное число диаппазона
     * @return Сумма чисел
     */
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    /**
     * Главный метод программы. Вычисляется сумма чисел в заданном диаппазоне значений.
     * Результа выводится на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(4, 9));
        System.out.println(sum(10, 15));
        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}
