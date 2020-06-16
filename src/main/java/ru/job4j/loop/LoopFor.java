package ru.job4j.loop;

/**
 * Class LoopFor
 * В классе практикуется работа с циклом for.
 * @author Dmitry Razumov
 * @version 1
 */
public class LoopFor {
    /**
     * Главный метод программы. С помощью цикла for выводит числа на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        for (int index = 5; index <= 10; index++) {
            System.out.println(index);
        }
    }
}
