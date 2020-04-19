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
        int result = first > second ? first : second;
        return result;
    }

    /**
     * Метод находит максимальное из трех чисел.
     * @param first Первое число
     * @param second Второе число
     * @param third Третье число
     * @return Максимальное число из трех
     */
    public static int max(int first, int second, int third) {
        int maximum = max(first, second);
        int result = maximum > third ? maximum : third;
        return result;
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
        int maximum = max(first, second, third);
        int result = maximum > four ? maximum : four;
        return result;
    }

}
