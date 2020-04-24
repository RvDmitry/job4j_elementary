package ru.job4j.pojo;

/**
 * Class Shop
 * @author Dmitry Razumov
 * @version 1
 */
public class Shop {
    /**
     * Метод удаляет элемент массива по заданному индексу. Затем осуществляет смещение null элемента в конец массива.
     * @param products Массив у которого нужно удалить элемент
     * @param index Индекс удаляемого элемента
     * @return Массив с удаленным элементом
     */
    public Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

    /**
     * Главный метод программы. Метод создает экземпляры класса Product, заполняет ими массив и выводит его на экран.
     * А также, демонстрирует работу метода delete.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 1");
        products[1] = null;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индексом 2");
        products[1] = products[2];
        products[2] = null;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println("\nПроинициализируем пустые элементы массива products и выведем их на экран.");
        products[2] = new Product("Potatoes", 20);
        products[3] = new Product("Apple", 4);
        products[4] = new Product("Tomatoes", 5);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println("\nУдаляем элемент с индексом 2 используя метод delete и выведем полученный массив на экран.");
        Shop shop = new Shop();
        shop.delete(products, 2);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}
