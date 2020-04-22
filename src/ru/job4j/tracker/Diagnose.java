package ru.job4j.tracker;

/**
 * Class Diagnose
 * Класс описывает диагноз и назначенное лечение.
 * @author Dmitry Razumov
 * @version 1
 */
public class Diagnose {
    /**
     * Диагноз.
     */
    private String diagnosis;

    /**
     * Назначенное, выполненное лечение.
     */
    private String treatment;

    /**
     * Диагноз содержит информацию о пациенте к которому он относится.
     */
    private Pacient pacient;

    /**
     * Конструктор создает объект диагноз для пациента.
     * @param pacient Пациент
     */
    public Diagnose(Pacient pacient) {
        this.pacient = pacient;
    }

    /**
     * Метод возвращает диагноз.
     * @return Диагноз
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * Метод возвращает назначенное, проведенное лечение.
     * @return Лечение
     */
    public String getTreatment() {
        return treatment;
    }

    /**
     * Метод задает диагноз.
     * @param diagnosis Диагноз
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * Метод задает лечение.
     * @param treatment Лечение
     */
    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
