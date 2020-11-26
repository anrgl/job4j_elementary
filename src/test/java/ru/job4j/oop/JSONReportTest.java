package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JSONReportTest {

    @Test
    public void generate() {
        JSONReport report = new JSONReport();
        String text = report.generate("JSONReport's name", "JSONReport's body");
        String expect = "{" + System.lineSeparator()
                + "\"name\": JSONReport's name,"
                + System.lineSeparator() + "\"body\": JSONReport's body"
                + System.lineSeparator() + "}";
        assertThat(text, is(expect));

    }
}