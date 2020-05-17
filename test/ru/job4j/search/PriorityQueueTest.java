package ru.job4j.search;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class PriorityQueueTest
 * @author Dmitry Razumov
 * @version 1
 */
public class PriorityQueueTest {
    /**
     * Метод проверяет формируется ли список задач упорядоченный по приоритету.
     * Задача с наивысшим приоритетом располагается в начале списка.
     */
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }
}