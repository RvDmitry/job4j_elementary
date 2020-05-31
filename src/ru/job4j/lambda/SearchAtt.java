package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Class SearchAtt
 * Класса осуществляет фильтрацию списка Attachment.
 * @author Dmitry Razumov
 * @version 1
 */
public class SearchAtt {
    /**
     * Метод фильтрует список по размеру вложения.
     * @param list Список
     * @return Фильтрованный список
     */
    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> pred = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment attachment) {
                return attachment.getSize() > 100;
            }
        };
        return filter(list, pred);
    }

    /**
     * Метод фильтрует список по наименованию вложения.
     * @param list Список
     * @return Фильтрованный список
     */
    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> pred = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment attachment) {
                return attachment.getName().contains("bug");
            }
        };
        return filter(list, pred);
    }

    /**
     * Метод фильтрует список либо по размеру вложения либо по наименованию вложения.
     * @param list Список
     * @param pred Функциональный интерфейс, определяет по какому параметру фильтровать список
     * @return Фильтрованный список
     */
    private static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> pred) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (pred.test(att)) {
                rsl.add(att);
            }
        }
        return rsl;
    }
}
