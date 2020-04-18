package ru.job4j.loop;

/**
 * Class Fitness
 * Класс вычисляет сколько месяцев уйдет на прогресс спортсмена.
 * @author Dmitry Razumov
 * @version 1
 */
public class Fitness {
    /**
     * Метод вычисляет сколько месяцев уйдет у первого спортсмена, чтобы по результатам тренировок в
     * становой тяге обогнать второго спорстмена.
     * @param ivan Значение становой тяги первого спортсмена
     * @param nik Значение становой тяги второго спорстмена
     * @return Количество месяцев
     */
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            month += 1;
        }
        return month;
    }
}
