package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JSONReportTest {

    @Test
    public void generate() {
        JSONReport report = new JSONReport();
        String text = report.generate("JSONReport's name", "JSONReport's body");
        String expect = "{\"name\": JSONReport's name, \"body\": JSONReport's body}";
        assertThat(text, is(expect));

    }
}