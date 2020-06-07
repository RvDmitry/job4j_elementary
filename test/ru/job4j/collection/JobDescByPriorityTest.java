package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class JobDescByPriorityTest
 * Класс тестирует сортировку по приоритету по убыванию.
 * @author Dmitry Razumov
 * @version 1
 */
public class JobDescByPriorityTest {

    @Test
    public void compare() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug C", 1),
                new Job("A task", 2),
                new Job("C task", 0),
                new Job("Fix bug A", 4)
        );
        List<Job> expected = List.of(
                new Job("Fix bug A", 4),
                new Job("A task", 2),
                new Job("Fix bug C", 1),
                new Job("C task", 0)
        );
        Collections.sort(jobs, new JobDescByPriority());
        assertThat(jobs, is(expected));
    }
}