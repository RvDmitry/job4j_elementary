package ru.job4j.poly;

/**
 * Class Transport
 * Класс характеризует автобус.
 * @author Dmitry Razumov
 * @version 1
 */
public class Bus implements Transport {
    /**
     * Количество пассажиров в автобусе.
     */
    private int numbers;

    /**
     * Стоимость литра топлава для автобуса.
     */
    private double price;

    /**
     * Поле характеризует движется ли автобус. true - движется, false - нет.
     */
    private boolean move;

    /**
     * Метод возвращает количество пассажиров в автобусе.
     * @return Количество пассажиров
     */
    public int getNumbers() {
        return numbers;
    }

    /**
     * Метод устанавливает стоимость за литр топлива для автобуса.
     * @param price Стоимость
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Метод приводит автобус в движение, если он не двигался. И останавливает автобус, если он двигался.
     */
    @Override
    public void drive() {
        if (move) {
            move = false;
        } else {
            move = true;
        }
    }

    /**
     * Метод задает количество пассажиров в автобусе.
     * @param numbers Количество пассажиров
     */
    @Override
    public void passengers(int numbers) {
        this.numbers = numbers;
    }

    /**
     * Метод осуществляет заправку автобуса.
     * @param amount Количество топлива
     * @return Цена за заправку
     */
    @Override
    public double refuel(double amount) {
        return amount * price;
    }
}
