package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenUnsortedThenSorted() {
        int[] in = {3, 4, 1, 6, 2, 5};
        int[] expect = {1, 2, 3, 4, 5, 6};
        int[] out = SortSelected.sort(in);
        assertThat(out, is(expect));
    }

    @Test
    public void whenSortedThenSorted() {
        int[] in = {1, 2, 3, 4, 5, 6};
        int[] expect = {1, 2, 3, 4, 5, 6};
        int[] out = SortSelected.sort(in);
        assertThat(out, is(expect));
    }
}