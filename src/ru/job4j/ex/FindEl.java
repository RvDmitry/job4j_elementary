package ru.job4j.ex;

/**
 * Class FindEl
 * Класс осуществляет поиск элемента в массиве.
 * @author Dmitry Razumov
 * @version 1
 */
public class FindEl {
    /**
     * Метод осуществляет поиск элемента в массиве.
     * @param value Массив строк
     * @param key Элемент, который нужно найти
     * @return Индекс элемента
     */
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("The element with this index is not found.");
        }
        return rsl;
    }

    /**
     * Главный метод программы. В методе практикуется обработка исключения.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        String[] strings = {"test1", "test2", "test3"};
        try {
            indexOf(strings, "test");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
