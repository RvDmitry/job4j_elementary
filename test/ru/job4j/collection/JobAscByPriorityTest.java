package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class JobAscByPriorityTest
 * Класс тестирует сортировку по приоритету по возрастанию.
 * @author Dmitry Razumov
 * @version 1
 */
public class JobAscByPriorityTest {

    @Test
    public void compare() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug A", 4),
                new Job("Fix bug C", 1),
                new Job("A task", 2),
                new Job("C task", 0)
        );
        List<Job> expected = List.of(
                new Job("C task", 0),
                new Job("Fix bug C", 1),
                new Job("A task", 2),
                new Job("Fix bug A", 4)
        );
        Collections.sort(jobs, new JobAscByPriority());
        assertThat(jobs, is(expected));
    }
}