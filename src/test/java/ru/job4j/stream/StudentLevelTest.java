package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class StudentLevelTest
 * @author Dmitry Razumov
 * @version 1
 */
public class StudentLevelTest {

    @Test
    public void whenSorted() {
        List<Student> input = new ArrayList<>();
        input.add(new Student("Pety", 128));
        input.add(new Student("Masha", 28));
        List<Student> expected = List.of(
                new Student("Masha", 28),
                new Student("Pety", 128)
        );
        assertThat(StudentLevel.levelOf(input, 20), is(expected));
    }

    @Test
    public void whenOnlyNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        List<Student> expected = List.of();
        assertThat(StudentLevel.levelOf(input, 100), is(expected));
    }

    @Test
    public void whenHasNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        input.add(new Student("Pety", 28));
        List<Student> expected = List.of(new Student("Pety", 28));
        assertThat(StudentLevel.levelOf(input, 10), is(expected));
    }

    @Test
    public void whenLevelOf() {
        List<Student> input = new ArrayList<>();
        input.add(new Student("Pety", 128));
        input.add(new Student("Masha", 28));
        input.add(new Student("Katya", 50));
        List<Student> expected = List.of(
                new Student("Katya", 50),
                new Student("Pety", 128)
        );
        assertThat(StudentLevel.levelOf(input, 40), is(expected));
    }
}