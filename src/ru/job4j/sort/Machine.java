package ru.job4j.sort;

import java.util.Arrays;

/**
 * Class Machine
 * Класс обрабытывает выдачу сдачи в кофе-машине.
 * @author Dmitry Razumov
 * @version 1
 */
public class Machine {
    /**
     * Поле задает номиналы момент, сдачу которыми выплачивает машина.
     */
    private final int[] coins = {10, 5, 2, 1};

    /**
     * Метод осуществляет расчет и выдачу сдачи с использованием жадного алгоритма.
     * Т.е. всегда выдаются моменты для сдачи с максимально возможным номиналом.
     * @param money Номинал купюры, которой рассчитывается пользователь
     * @param price Цена за кофе
     * @return Сдача монетами
     */
    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int cashback = money - price;
        for (int coin : coins) {
            while (cashback - coin >= 0) {
                rsl[size++] = coin;
                cashback -= coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
