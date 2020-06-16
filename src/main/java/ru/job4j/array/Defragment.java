package ru.job4j.array;

/**
 * Class Defragment
 * Класс осуществляет дефрагментацию массива.
 * @author Dmitry Razumov
 * @version 1
 */
public class Defragment {
    /**
     * Метод осуществляет дефрагментацию массива. Null элементы в массиве перемещаются в конец массива.
     * @param array Массив который нужно дефрагментировать
     * @return Возвращает дефрагментированный массив
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int j = index + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        array[index] = array[j];
                        array[j] = null;
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    /**
     * Главный метод программы. Демонстрирует работу метода compress.
     * Задается фрагментированный массив строк, в котором содержаться null элементы.
     * Вызывается метод compress, который дефрагментирует массив. Итоговый массив выводится на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
