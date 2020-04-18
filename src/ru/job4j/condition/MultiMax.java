package ru.job4j.condition;

/**
 * Class MultiMax
 * В классе практикуется работа с тернарным оператом и возвращается максимальное число из трех.
 * @author Dmitry Razumov
 * @version 1
 */
public class MultiMax {
    /**
     * Метод находит максимальное число из трех.
     * @param first Первое число
     * @param second Второе число
     * @param third Третье число
     * @return Максимальное число из трех
     */
    public int max(int first, int second, int third) {
        int max = first > second ? first : second;
        int result = max > third ? max : third;
        return result;
    }
}
