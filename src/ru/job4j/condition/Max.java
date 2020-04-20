package ru.job4j.condition;

/**
 * Class Max
 * В классе практикуется работа с тернарным оператом и возвращается максимальное число
 * из двух, трех, и четырех чисел.
 * @author Dmitry Razumov
 * @version 2
 */
public class Max {
    /**
     * Метод находит максимальное из двух чисел.
     * @param first Первое число
     * @param second Второе число
     * @return Максимальное число из двух
     */
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    /**
     * Метод находит максимальное из трех чисел.
     * @param first Первое число
     * @param second Второе число
     * @param third Третье число
     * @return Максимальное число из трех
     */
    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    /**
     * Метод находит максимальное из четырех чисел.
     * @param first Первое число
     * @param second Второе число
     * @param third Третье число
     * @param four Четвертое число
     * @return Максимальное число из четырех
     */
    public static int max(int first, int second, int third, int four) {
        return max(max(first, second, third), four);
    }

}
