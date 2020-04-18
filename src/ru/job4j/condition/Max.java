package ru.job4j.condition;

/**
 * Class Max
 * В классе практикуется работа с тернарным оператом и возвращается максимальное число из двух.
 * @author Dmitry Razumov
 * @version 1
 */
public class Max {
    /**
     * Метод находит максимальное из двух чисел.
     * @param left Первое число
     * @param right Второе число
     * @return Максимальное число из двух
     */
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
}
