package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Class FunctionCount
 * Класс вычисляет функцию.
 * @author Dmitry Razumov
 * @version 1
 */
public class FunctionCount {
    /**
     * Метод вычисляет значение функции в заданном диаппазоне.
     * @param start Начальное значение диаппазона
     * @param end Конечно значение даппазона
     * @param func Функция
     * @return Список значений функции
     */
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        for (int i = start; i < end; i++) {
            rsl.add(func.apply((double) i));
        }
        return rsl;
    }
}
