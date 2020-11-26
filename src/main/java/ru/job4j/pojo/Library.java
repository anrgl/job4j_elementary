package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book warAndPeace = new Book("Война и Мир", 1200);
        Book cleanCode = new Book("Clean code", 547);
        Book byteOfPython = new Book("Укус Питона", 124);
        Book headFirstJava = new Book("Head First Java", 650);

        Book[] books = new Book[4];
        books[0] = warAndPeace;
        books[1] = cleanCode;
        books[2] = byteOfPython;
        books[3] = headFirstJava;

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("The book " + book.getName() + " " + book.getPageCount() + " pages.");
        }

        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("The book " + book.getName() + " " + book.getPageCount() + " pages.");
        }

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].getName());
            }
        }
    }
}
