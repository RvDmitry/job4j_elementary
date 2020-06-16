package ru.job4j.pojo;

/**
 * Class Store
 * @author Dmitry Razumov
 * @version 1
 */
public class Store {
    /**
     * Главный метод программы. Создается массив продуктов и выводится на экран.
     * @param args Параметры командной строки.
     */
    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);
        Product[] prods = new Product[3];
        prods[0] = milk;
        prods[1] = bread;
        prods[2] = egg;
        for (int index = 0; index < prods.length; index++) {
            Product pr = prods[index];
            System.out.println(pr.getName() + " - " + pr.getCount());
        }
        System.out.println("Replace milk to oil.");
        Product oil = new Product("Oil", 11);
        prods[0] = oil;
        for (int index = 0; index < prods.length; index++) {
            Product pr = prods[index];
            System.out.println(pr.getName() + " - " + pr.getCount());
        }
        System.out.println("Shown only product.count > 10");
        for (int index = 0; index < prods.length; index++) {
            Product pr = prods[index];
            if (pr.getCount() > 10) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }
    }
}
