package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MachineTest {
    @Test
    public void whenEquals() {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35() {
        Machine machine = new Machine();
        int[] expected = {10, 5};
        int[] rsl = machine.change(50, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when100by10() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 10, 10, 10, 10, 10, 10, 10}; // length == 9
        int[] rsl = machine.change(100, 10);
        assertThat(rsl, is(expected));
    }
}