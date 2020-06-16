package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Class ConvertList
 * Класс преобразует список массивов из чисел в список чисел.
 * @author Dmitry Razumov
 * @version 1
 */
public class ConvertList {
    /**
     * Метод конвертирует список массива чисел в список чисел.
     * @param list Список массивов
     * @return Список чисел
     */
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] row : list) {
            for (int cell : row) {
                rsl.add(cell);
            }
        }
        return rsl;
    }
}
