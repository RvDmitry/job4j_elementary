package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5To5Then5() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax4To3Then4() {
        int result = Max.max(4, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax2To5Then5() {
        int result = Max.max(2, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMaxThreeNumbers() {
        int result = Max.max(4, 3, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMaxFourNumbers() {
        int result = Max.max(4, 7, 5, 2);
        assertThat(result, is(7));
    }
}