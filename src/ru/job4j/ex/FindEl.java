package ru.job4j.ex;

/**
 * Class FindEl
 * Класс осуществляет поиск элемента в массиве.
 * @author Dmitry Razumov
 * @version 1
 */
public class FindEl {
    /**
     * Метод осуществляет поиск элемента в массиве. Если элемент не найден, метод генерирует исключение.
     * @param value Массив строк
     * @param key Элемент, который нужно найти
     * @return Индекс элемента
     * @throws ElementNotFoundException Исключение, если элемент не найден
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
     * Метод проверяет входит ли ключ в список запрещенных ключей.
     * Если входит, метод генерирует исключение. Если не входит, метод отправляет сообщение.
     * @param value Ключ, который нужно проверить
     * @param abuses Список запрещенных ключей
     * @return true, если сообщение отправлено успешно, иначе false
     * @throws ElementAbuseException Исключение, если ключ входит в список запрещенных
     */
    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        for (String str : abuses) {
            if (str.equals(value)) {
                throw new ElementAbuseException("The key is on the forbidden list.");
            }
        }
        return true;
    }

    /**
     * Метод ищет ключ в списке ключей, проверяет его на отсутствие в списке запрещенных ключей и отправляет сообщение.
     * @param values Список ключей
     * @param key Ключ
     * @param abuses Запрещенный список ключей
     */
    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Главный метод программы. В методе практикуется обработка исключения.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        String[] values = {"key1", "key2", "key3"};
        String[] abuses = {"key1", "key4", "key5"};
        process(values, "key2", abuses);
    }
}
