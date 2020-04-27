package ru.job4j.poly;

/**
 * Class Service
 * @author Dmitry Razumov
 * @version 1
 */
public class Service {
    /**
     * Поле хранилище.
     */
    private Store store;

    /**
     * Конструктор инициализирует хранилище.
     * @param store Хранилище
     */
    public Service(Store store) {
        this.store = store;
    }

    /**
     * Метод extract.
     */
    public void extract() {
        store.save("Petr Arsentev");
    }

    /**
     * Главный метод программы.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Store store = new DbStore();
//        Store store = new FileStore();
        Service service = new Service(store);
        service.extract();
    }
}
