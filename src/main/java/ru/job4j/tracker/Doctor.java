package ru.job4j.tracker;

/**
 * Class Doctor
 * Класс описывает специальность доктор.
 * @author Dmitry Razumov
 * @version 1
 */
public class Doctor extends Profession {
    /**
     * Врачебная категория.
     */
    private String category;

    /**
     * Ученая степень.
     */
    private String degree;

    /**
     * Метод возвращает категорию.
     * @return Категория
     */
    public String getCategory() {
        return category;
    }

    /**
     * Метод возвращает ученую степень.
     * @return Ученая степень
     */
    public String getDegree() {
        return degree;
    }

    /**
     * Метод задет врачебную категорию.
     * @param category Категория
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Метод задает ученую степень.
     * @param degree Ученая степень
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * Метод возвращает диагноз пациента.
     * @param pacient Пациен
     * @return Диагноз
     */
    public Diagnose heal(Pacient pacient) {
        return null;
    }

    /**
     * Метод возвращает больничный лист
     * @param pacient Пациент
     * @return Больничный лист
     */
    public SickLeave writeOut(Pacient pacient) {
        return null;
    }
}
