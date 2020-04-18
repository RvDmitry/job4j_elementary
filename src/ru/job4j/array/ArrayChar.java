package ru.job4j.array;

/**
 * Class ArrayChar
 * Класс осуществляет проверку массива символов.
 * @author Dmitry Razumov
 * @version 1
 */
public class ArrayChar {
    /**
     * Метод проверяет начинается ли массив символов, символами находящимися в другом массиве.
     * @param word Массив который нужно проверить
     * @param pref Массив в котором содержатся проверочные символы
     * @return true, если массив начинается с заданных символов, false, если символы не совпадают
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
