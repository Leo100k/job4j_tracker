package ru.job4j.pojo;

public class Book {
    private String nameBook;
    private int quantityPages;

    public Book(String nameBook, int quantityPages) {
        this.nameBook = nameBook;
        this.quantityPages = quantityPages;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getQuantityPages() {
        return quantityPages;
    }

    public void setQuantityPages(int quantityPages) {
        this.quantityPages = quantityPages;
    }
}
