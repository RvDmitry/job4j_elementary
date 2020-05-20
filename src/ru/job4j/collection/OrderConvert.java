package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

/**
 * Class OrderConvert
 * Класс конвертирует список заказов в коллекцию Map.
 * @author Dmitry Razumov
 * @version 1
 */
public class OrderConvert {
    /**
     * Метод конвертирует список заказов в коллекцию Map.
     * @param orders Список заказов
     * @return Карта заказов
     */
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order : orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }
}
