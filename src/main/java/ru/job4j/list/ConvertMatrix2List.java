package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Class ConvertMatrix2List
 * Класс конвертирует двухмерный массив в список.
 * @author Dmitry Razumov
 * @version 1
 */
public class ConvertMatrix2List {
    /**
     * Метод преобразует двухмернй массив в список.
     * @param array Двухмерный массив
     * @return Список
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}
