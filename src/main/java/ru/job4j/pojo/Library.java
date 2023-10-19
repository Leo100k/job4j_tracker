package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 5);
        Book interesting = new Book("Interesting", 3);
        Book boring = new Book("Boring", 20);
        Book fanny = new Book("Fanny", 1);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = interesting;
        books[2] = boring;
        books[3] = fanny;
        for (Book b : books) {
            System.out.println(b.getNameBook() + " - " + b.getQuantityPages());
        }
        System.out.println("Replace index with 0 and index three");
        books[3] = cleanCode;
        books[0] = fanny;
        for (Book b : books) {
            System.out.println(b.getNameBook() + " - " + b.getQuantityPages());
        }
        System.out.println("Printing only Clean code");
        for (Book b : books) {
            if (b.equals(cleanCode)) {
                System.out.println(b.getNameBook() + " - " + b.getQuantityPages());
            }
        }
    }
}
