package ru.job4j.tracker;

import java.time.LocalDate;

/**
 * Class SickLeave
 * Класс описывает оформление больничного листа.
 * @author Dmitry Razumov
 * @version 1
 */
public class SickLeave {
    /**
     * Место работы.
     */
    private String job;

    /**
     * Дата открытия больничного листа.
     */
    private LocalDate start;

    /**
     * Дата закрытия больничного листа.
     */
    private LocalDate end;

    /**
     * Больничный лист содержит информацию о пациенте к которому он относится.
     */
    private Pacient pacient;

    public SickLeave(Pacient pacient) {
        this.pacient = pacient;
    }

    /**
     * Метод возвращает место работы пациента.
     * @return Место работы
     */
    public String getJob() {
        return job;
    }

    /**
     * Метод возврашает дату открытия больничного листа.
     * @return Дата
     */
    public LocalDate getStart() {
        return start;
    }

    /**
     * Метод возврашает дату закрытия больничного листа.
     * @return Дата
     */
    public LocalDate getEnd() {
        return end;
    }

    /**
     * Метод задает место работы пациента.
     * @param job Место работы
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * Метод задает дату открытия больничного листа.
     * @param start Дата
     */
    public void setStart(LocalDate start) {
        this.start = start;
    }

    /**
     * Метод задает дату закрытия больничного листа.
     * @param end Дата
     */
    public void setEnd(LocalDate end) {
        this.end = end;
    }
}
