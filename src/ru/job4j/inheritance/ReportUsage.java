package ru.job4j.inheritance;

/**
 * Class ReportUsage
 * @author Dmitry Razumov
 * @version 1
 */
public class ReportUsage {
    /**
     * Главный метод программы. Генерирует строку разными способами и выводит на экран.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
