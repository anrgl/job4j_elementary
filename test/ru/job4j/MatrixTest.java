package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {
    @Test
    public void when2on2() {
        int[][] table = Matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(table, is(expect));
    }

    @Test
    public void when1on1() {
        int[][] table = Matrix.multiple(1);
        int[][] expect = {
                {1}
        };
        assertThat(table, is(expect));
    }

    @Test
    public void when0on0() {
        int[][] table = Matrix.multiple(0);
        int[][] expect = {
        };
        assertThat(table, is(expect));
    }
}