package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenFirstOneLastSixThenFirstSixLastOne() {
        int[] in = {1, 2, 3, 4, 5, 6};
        int[] expect = {6, 2, 3, 4, 5, 1};
        int[] out = SwitchArray.swapBorder(in);
        assertThat(out, is(expect));
    }

    @Test
    public void whenArrayLengthIsOne() {
        int[] in = {1};
        int[] expect = {1};
        int[] out = SwitchArray.swapBorder(in);
        assertThat(out, is(expect));
    }

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to2() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {1, 3, 2, 4};
        int[] rsl = SwitchArray.swap(input, 1, 2);
        assertThat(rsl, is(expect));
    }
}