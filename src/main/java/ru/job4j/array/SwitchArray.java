package ru.job4j.array;

/**
 * Class SwitchArray
 * Класс осуществляет перестановку элементов массива.
 * @author Dmitry Razumov
 * @version 1
 */
public class SwitchArray {
    /**
     * Метод меняет местами элементы массива.
     * @param array Массив, в котором нужно поменять местами элементы
     * @param source Исходный элемент
     * @param dest Элемент, с которым нужно поменяться местами
     * @return Массив, в котором элементы поменяны местами
     */
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    /**
     * Метод который меняет местами первый и последний элемент массива.
     * @param array Массив, в котором нужно поменять элементы местами
     * @return Массив, в котором первый и последний элемент поменяны местами
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    /**
     * Главный метод программы. Проверяет работу метода swapBorder. Итоговый массив выводится на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}
