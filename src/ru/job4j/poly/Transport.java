package ru.job4j.poly;

/**
 * Interface Transport
 * Интерфейс определяет любой вид транспорта.
 * @author Dmitry Razumov
 * @version 1
 */
public interface Transport {
    /**
     * Метод приводит в движение транспортного средства
     */
    void drive();

    /**
     * Метод характеризует количество перевозимых пассажиров транспортного средства.
     * @param numbers Количество пассажиров
     */
    void passengers(int numbers);

    /**
     * Метод выполняет заправку транспортного средства.
     * @param amount Количество топлива
     * @return Цена за топливо
     */
    double refuel(double amount);
}
