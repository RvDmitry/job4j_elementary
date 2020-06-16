package ru.job4j.array;

/**
 * Class BarleyBreak
 * Класс содержит только метод Main, в котором практикуется работа с массивами.
 * @author Dmitry Razumov
 * @version 1
 */
public class BarleyBreak {
    /**
     * Главный метод программы. В методе объявляются массивы.
     * Одному массиву присваиваются значения путем обращения к ячейкам массива.
     * Другой массив объявляется в одновременной инициализацией его элементов.
     * Элементы массива выводятся через цикл на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        int[][] table = new int[3][3];
        table[0][0] = 1;
        table[0][1] = 2;
        table[0][2] = 3;
        table[1][0] = 4;
        table[1][1] = 5;
        table[1][2] = 6;
        table[2][0] = 7;
        table[2][1] = 8;
        table[2][2] = 9;
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
}
