package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class FactTest
 * @author Dmitry Razumov
 * @version 1
 */
public class FactTest {

    @Test
    public void when4Then24() {
        Fact fact = new Fact();
        int rsl = fact.calc(4);
        assertThat(rsl, is(24));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenMinusTwoThenException() {
        new Fact().calc(-2);
    }
}