package ru.job4j.lambda;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * Class FI
 * В классе практикуется использование функционального интерфейса.
 * @author Dmitry Razumov
 * @version 1
 */
public class FI {
    /**
     * Главный метод программы.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Arrays.sort(atts, comparator);
        for (var item : atts) {
            System.out.println("name:" + item.getName() + " /size:" + item.getSize());
        }
        Function<Attachment, InputStream> func = new Function<Attachment, InputStream>() {
            @Override
            public InputStream apply(Attachment attachment) {
                return null;
            }
        };
    }

    /**
     * Метод с помощью функционального интерфейса преобразует объект Attachent в InputStream.
     * @param list Список объектов Attachment
     * @param func Функциональный интерфейс
     */
    public static void raw(List<Attachment> list, Function<Attachment, InputStream> func) {
        for (Attachment att : list) {
            func.apply(att);
        }
    }
}
