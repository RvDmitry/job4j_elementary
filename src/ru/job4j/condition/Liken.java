package ru.job4j.condition;

/**
 * Class Liken
 * В классе практикуется работа с условными выражениями.
 * @author Dmitry Razumov
 * @version 1
 */
public class Liken {
    /**
     * Главный метод программы. Выводит на консоль результаты операторов сравнения.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        int first = 10;
        int second = 9;
        boolean result = first > second;
        System.out.println(result);
        result = first < second;
        System.out.println(result);
        result = first == second;
        System.out.println(result);
    }
}
