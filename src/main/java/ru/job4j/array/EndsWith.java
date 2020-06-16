package ru.job4j.array;

/**
 * Class EndsWith
 * Класс осуществляет проверку массива символов.
 * @author Dmitry Razumov
 * @version 1
 */
public class EndsWith {
    /**
     * Метод проверяет заканчивается ли массив символов, символами находящимися в другом массиве.
     * @param word Массив который нужно проверить
     * @param post Массив в котором содержатся проверочные символы
     * @return true, если массив оканчивается заданными символами, false, если символы не совпадают
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
