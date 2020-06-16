package ru.job4j.pojo;

/**
 * Class Library
 * @author Dmitry Razumov
 * @version 1
 */
public class Library {
    /**
     * Главный метод программы. Создаются экземпляры класса Book и выводятся на экран.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Book java = new Book("Head First Java", 717);
        Book kotlin = new Book("Head First Kotlin", 464);
        Book android = new Book("Head First Android", 909);
        Book martin = new Book("Clean code", 464);
        Book[] books = new Book[4];
        books[0] = java;
        books[1] = kotlin;
        books[2] = android;
        books[3] = martin;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + " - " + books[index].getCount());
        }
        System.out.println("The first and last books are reversed.");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + " - " + books[index].getCount());
        }
        System.out.println("Books called Clean code");
        for (int index = 0; index < books.length; index++) {
            if (books[index].getName().equals("Clean code")) {
                System.out.println(books[index].getName() + " - " + books[index].getCount());
            }
        }
    }
}
