package ru.job4j.collection;

import java.util.HashSet;

/**
 * Class UniqueText
 * Класс проверяет уникальность текста.
 * @author Dmitry Razumov
 * @version 1
 */
public class UniqueText {
    /**
     * Метод сравнивает два текста ввиде строк.
     * @param originText Оригинальная строка
     * @param duplicateText Строка, которую нужно сравнить с первой на оригинальность
     * @return true, если строки совпадают, иначе false
     */
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String str : origin) {
            check.add(str);
        }
        for (String str : text) {
            if (!check.contains(str)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
