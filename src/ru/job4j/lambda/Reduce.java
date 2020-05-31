package ru.job4j.lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/**
 * Class Reduce
 * @author Dmitry Razumov
 * @version 1
 */
public class Reduce {
    /**
     * Метод суммирует числа.
     * @param to Число, до которогу нужно вычислисть сумму чисел.
     * @return Сумма чисел
     */
    public static int summation(int to) {
        BiFunction<Integer, Integer, Integer> func = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer left, Integer right) {
                return left + right;
            }
        };
        Supplier<Integer> initValue = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 0;
            }
        };
        return loop(to, func, initValue);
    }

    /**
     * Метод перемножает числа.
     * @param to Число, до которого нужно перемножить числа
     * @return Произведение чисел
     */
    public static int multiplication(int to) {
        BiFunction<Integer, Integer, Integer> func = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer left, Integer right) {
                return left * right;
            }
        };
        Supplier<Integer> initValue = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 1;
            }
        };
        return loop(to, func, initValue);
    }

    /**
     * Метод вычисляет сумму либо произведение чисел в зависимости от переданного функционального интерфейса.
     * @param to Число, до которогу нужно выполнить вычисления
     * @param func Функциональный интерфейс
     * @param initValue Начальное значение от которого нужно начинать вычисления
     * @return Результат вычисления
     */
    private static int loop(int to, BiFunction<Integer, Integer, Integer> func, Supplier<Integer> initValue) {
        int rsl = initValue.get();
        for (int index = 1; index <= to; index++) {
            rsl = func.apply(rsl, index);
        }
        return rsl;
    }

    /**
     * Главный метод программы.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        System.out.println(summation(3));
        System.out.println(multiplication(3));
    }
}
