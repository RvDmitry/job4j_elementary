package ru.job4j.array;

/**
 * Class Matrix
 * В классе практикуется работа с массивом.
 * @author Dmitry Razumov
 * @version 1
 */
public class Matrix {
    /**
     * Метод создает двухмерный массив и заполняет его значениями из таблицы умножения.
     * @param size Размерность массива.
     * @return Массив заполненный числами из таблицы умножения
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                table[i - 1][j - 1] = i * j;
            }
        }
        return table;
    }
}
