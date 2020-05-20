package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Class UsageMap
 * В классе практикуется работа с коллекцией Map.
 * @author Dmitry Razumov
 * @version 1
 */
public class UsageMap {
    /**
     * Главный метод программы.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ivanovii@yandex.ru", "Ivanov Ivan Ivanovich");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
