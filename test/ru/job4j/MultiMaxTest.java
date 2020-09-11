package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(42, 4, 2);
        assertThat(result, is(42));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 21);
        assertThat(result, is(21));
    }

    @Test
    public void whenAllEquals() {
        int result = MultiMax.max(1, 1, 1);
        assertThat(result, is(1));
    }
}