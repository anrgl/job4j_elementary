package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SquareTest {
    @Test
    public void whenBound5Then014916() {
        int in = 5;
        int[] expected = {0, 1, 4, 9, 16};
        int[] out = Square.calculate(in);
        assertThat(out, is(expected));
    }

    @Test
    public void whenBound4Then0149() {
        int in = 4;
        int[] expected = {0, 1, 4, 9};
        int[] out = Square.calculate(in);
        assertThat(out, is(expected));
    }

    @Test
    public void whenBound3Then014() {
        int in = 3;
        int[] expected = {0, 1, 4};
        int[] out = Square.calculate(in);
        assertThat(out, is(expected));
    }
}