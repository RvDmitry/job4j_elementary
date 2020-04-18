package ru.job4j.loop;

/**
 * Class Mortgage
 * Класс расчитывает через сколько лет будет закрыт долг по кредиту.
 * @author Dmitry Razumov
 * @version 1
 */
public class Mortgage {
    /**
     * Метод вычисляет через сколько лет будет закрыт долг по кредиту с учетом величины суммы кредита,
     * процентов по кредиту и годовому заработку.
     * @param amount Сумма кредита
     * @param salary Заработная плата за год
     * @param percent Проценты по кредиту
     * @return Количество лет
     */
    public int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            year += 1;
            amount += amount * percent / 100;
            amount -= salary;
        }
        return year;
    }
}
