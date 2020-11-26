package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {
    @Test
    public void whenArraysLengthIsOdd() {
        int[] in = {1, 2, 3};
        int[] expect = {3, 2, 1};
        int[] out = Turn.back(in);
        assertThat(out, is(expect));
    }

    @Test
    public void whenArraysLengthIsEven() {
        int[] in = {1, 2, 3, 4};
        int[] expect = {4, 3, 2, 1};
        int[] out = Turn.back(in);
        assertThat(out, is(expect));
    }
}