package ru.job4j.ex;

/**
 * Class Count
 * Класс вычисляет сумму чисел.
 * @author Dmitry Razumov
 * @version 1
 */
public class Count {
    /**
     * Метод вычисляет сумму чисел. Конечное число не входит в диаппазон суммы.
     * @param start Начальное число
     * @param finish Конечное число
     * @return Сумма
     */
    public static int add(int start, int finish) {
        if (start > finish) {
            throw new IllegalArgumentException("Start should be less then finish.");
        }
        int rsl = 0;
        for (int index = start; index != finish; index++) {
            rsl += index;
        }
        return rsl;
    }

    /**
     * Главный метод программы.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        System.out.println("Sum of 2 to 10 is : " + add(10, 2));
    }
}
