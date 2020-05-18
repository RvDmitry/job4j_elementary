package ru.job4j.collection;

import java.util.List;

/**
 * Class ConvertList2Array
 * Класс конвертирует список в двухмерный массив.
 * @author Dmitry Razumov
 * @version 1
 */
public class ConvertList2Array {
    /**
     * Метод преобразует список в двухмерный массив, разбивая его на группы строк,
     * с заданным числом элементов.
     * @param list Список, который нужно конвертировать в двухмерный массив
     * @param cells Количество элементов в строке
     * @return Двухмерный массив
     */
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            if (cell == cells) {
                cell = 0;
                row++;
            }
            array[row][cell++] = num;
        }
        return array;
    }

    /**
     * Главный метод программы. Метод создает список и с помощью метода toArray конвертирует
     * его в двухмерный массив. Результат выводиться на экран.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] rsl = toArray(list, 3);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
