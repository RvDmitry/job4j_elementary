package ru.job4j.loop;

/**
 * Class CheckPrimeNumber
 * Класс проверяет является ли заданное число простым.
 * @author Dmitry Razumov
 * @version 1
 */
public class CheckPrimeNumber {
    /**
     * Метод проверяет является ли заданное число простым.
     * @param number Число, которое нужно проверить на критерий простого числа
     * @return true, если число является простым, false, если число простым не является
     */
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
