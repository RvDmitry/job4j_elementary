package ru.job4j.search;

import java.util.LinkedList;

/**
 * Class PriorityQueue
 * Класс описывает список задач.
 * @author Dmitry Razumov
 * @version 1
 */
public class PriorityQueue {
    /**
     * Список задач.
     */
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     * Задача с наивысшим приоритетом располагается в начале списка.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (task.getPriority() < element.getPriority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, task);
    }

    /**
     * Метод возвращает первый элемент списка. Сам элемент из списка удаляется.
     * @return Задача первая по списку
     */
    public Task take() {
        return tasks.poll();
    }
}
