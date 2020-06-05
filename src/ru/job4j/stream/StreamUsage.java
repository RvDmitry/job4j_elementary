package ru.job4j.stream;

import java.util.List;

/**
 * Class StreamUsage
 * В классе практикуется работа с потоками.
 * @author Dmitry Razumov
 * @version 1
 */
public class StreamUsage {
    /**
     * Class Task
     * Класс описывает параметры задачи.
     */
    public static class Task {
        /**
         * Наименование задачи.
         */
        private final String name;
        /**
         * Затраченное время.
         */
        private final long spent;

        /**
         * Конструктор инициализирует параметры задачи.
         * @param name Наименование задачи
         * @param spent Затраченное время
         */
        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }
    }

    /**
     * Главный метод программы. Создается список задач и выводится на экран.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug #1", 10),
                new Task("Task #2", 20),
                new Task("Bug #3", 40)
        );
        tasks.stream()
                .filter(task -> task.name.contains("Bug"))
                .filter(task -> task.spent > 30)
                .map(task -> task.name + " " + task.spent)
                .forEach(System.out::println);
    }
}