package ru.job4j.tracker;

/**
 * Class Bug
 * @author Dmitry Razumov
 * @version 1.5
 */
public class Bug extends Item {
    /**
     * Коструктор заменяет конструктор по умолчанию и требует передачи параметра.
     * @param name Переменная name
     */
    public Bug(String name) {
        super(name);
    }
}
