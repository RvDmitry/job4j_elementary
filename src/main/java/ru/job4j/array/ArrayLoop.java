package ru.job4j.array;

/**
 * Class ArrayLoop
 * Класс содержит только главный метод Main, в котором практикуется работа с массивом.
 * @author Dmitry Razumov
 * @version 1
 */
public class ArrayLoop {
    /**
     * Главный метод программы. Объявляется массив. С помощью цикла происходит присваивание значении
     * элементам массива. Так же с помощью цикла элементы массива выводятся на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
    }
}
