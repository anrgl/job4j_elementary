package ru.job4j.oop;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);

        HtmlReport htmlReport = new HtmlReport();
        String html = htmlReport.generate("JSONReport's name", "JSONReport's body");
        System.out.println(html);
    }
}
