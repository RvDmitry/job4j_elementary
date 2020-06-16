package ru.job4j.condition;

/**
 * Class ThreeMax
 * Класс находит максимум из трех чисел.
 * @author Dmitry Razumov
 * @version 1
 */
public class ThreeMax {
    /**
     * Метод находит максимальное значение из трех чисел.
     * @param first Первое число
     * @param second Второе число
     * @param third Третье число
     * @return Максимальное число
     */
    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first >= third) {
            result = first;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }
}
