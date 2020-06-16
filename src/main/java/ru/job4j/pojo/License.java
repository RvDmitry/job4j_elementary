package ru.job4j.pojo;

import java.util.Date;
import java.util.Objects;

/**
 * Class License
 * Класс характеризует паспорт транспортного средства.
 * @author Dmitry Razumov
 * @version 1
 */
public class License {
    /**
     * Владелец машины.
     */
    private String owner;

    /**
     * Марка машины.
     */
    private String model;

    /**
     * Номер машины.
     */
    private String code;

    /**
     * Дата сборки.
     */
    private Date created;

    /**
     * Метод возвращает владельца машины.
     * @return Владелец
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Метод задает владельца машины.
     * @param owner Владелец
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Метод возвращает марку машины.
     * @return Марка
     */
    public String getModel() {
        return model;
    }

    /**
     * Метод задает марку машины.
     * @param model Марка
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Метод возвращает номер машины.
     * @return Номер
     */
    public String getCode() {
        return code;
    }

    /**
     * Метод задает номер машины.
     * @param code Номер
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Метод возвращает дату сборки.
     * @return Дата сборки
     */
    public Date getCreated() {
        return created;
    }

    /**
     * Метод задает дату сборки.
     * @param created Дата сборки
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        License license = (License) o;
        return Objects.equals(owner, license.owner)
                && Objects.equals(model, license.model)
                && Objects.equals(code, license.code)
                && Objects.equals(created, license.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, model, code, created);
    }
}
