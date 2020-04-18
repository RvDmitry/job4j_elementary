package ru.job4j.loop;

/**
 * Class PrimeNumber
 * Класс вычисляет количество простых чисел.
 * @author Dmitry Razumov
 * @version 1
 */
public class PrimeNumber {
    /**
     * Метод вычисляет количество простых чисел до заданного числа.
     * @param finish Число до которого нужно вычислить количество простых чисел
     * @return Количество простых чисел
     */
    public int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count += 1;
            }
        }
        return count;
    }
}
