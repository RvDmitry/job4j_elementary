package ru.job4j.calculator;

/**
 * Сlass Calculator
 * Класс в котором практикуется работа с переменными и основными арифметическими операциями.
 * @author Dmitry Razumov
 * @version 1
 */
public class Calculator {
    /**
     * Главный метод программы. В методе создаются переменные, далее над ними производятся операции +,-,*,/.
     * Результаты арифметических операций выводятся на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int plus = one + two;
        int six = 6;
        int four = 4;
        int five = 5;
        int div = six / two;
        int minus = five - two;
        int mult = four * two;
        System.out.println(plus);
        System.out.println(div);
        System.out.println(minus);
        System.out.println(mult);
    }
}
