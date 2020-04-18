package ru.job4j.array;

/**
 * Class Square
 * Класс создает массив элементы которого равны числам возведенным в квадрат.
 * @author Dmitry Razumov
 * @version 1
 */
public class Square {
    /**
     * Метод создает массив на основе последовательности чисел, значения которого равны квадрату этих чисел.
     * @param bound Число, на основе которого создается массив.
     * @return Массив квадратов чисел
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = i * i;
        }
        return rst;
    }

    /**
     * Главный метод программы. Проверяет работу метода calculate. Полученный массив выводится на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
