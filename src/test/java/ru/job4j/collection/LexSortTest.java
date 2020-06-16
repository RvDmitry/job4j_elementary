package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class LexSortTest
 * Класс тестирует сортировку наименований разделов лекции по их номерам.
 * @author Dmitry Razumov
 * @version 1
 */
public class LexSortTest {
    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        String[] out = {
                "1. Task.",
                "2. Task.",
                "10. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }

    @Test
    public void whenSortSectionByNumber() {
        String[] input = {
                "10. Тест.",
                "2. Велосипед.",
                "1. Як."
        };
        String[] out = {
                "1. Як.",
                "2. Велосипед.",
                "10. Тест."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }
}