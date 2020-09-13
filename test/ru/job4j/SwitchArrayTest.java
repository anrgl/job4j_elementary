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
}