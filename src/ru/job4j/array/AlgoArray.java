package ru.job4j.array;

/**
 * Class AlgoArray
 * В классе используется только главный метод Main, в котором практикуется работа с массивом.
 * @author Dmitry Razumov
 * @version 1
 */
public class AlgoArray {
    /**
     * Главный метод программы. Выводит элементы заданного массива в порядке возрастания на консоль.
     * Сортировка выполнена в ручную.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        temp = array[1];
        array[1] = array[2];
        array[2] = temp;
        temp = array[3];
        array[3] = array[4];
        array[4] = temp;
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
